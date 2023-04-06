package com.cabradati.monitorable;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;

import java.text.MessageFormat;
import java.time.Duration;
import java.util.LinkedList;

@Aspect
public class MonitorableProfiler {

    @Autowired
    private MeterRegistry meterRegistry;

    private static final String TIMER_NAME = "method.execution.time";
    private static final String TAG_EXECUTION_RESULT_NAME = "executionResult";
    private static final String TAG_EXECUTION_SUCCESS = "SUCCESS";
    private static final String TAG_EXECUTION_FAIL = "FAIL";

    @Around("@annotation(monitorable)")
    public Object annotation(final ProceedingJoinPoint proceedingJoinPoint, final Monitorable monitorable) throws Throwable {
        return profile(proceedingJoinPoint);
    }

    @Around("@within(monitorable)")
    public Object within(final ProceedingJoinPoint proceedingJoinPoint, final Monitorable monitorable) throws Throwable {
        return profile(proceedingJoinPoint);
    }

    public Object profile(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        final var stopWatch = new StopWatch();

        Object proceed;

        final String className = proceedingJoinPoint.getTarget().getClass().getSimpleName();
        final String methodName = proceedingJoinPoint.getSignature().getName();

        final var tags = new LinkedList<Tag>();
        tags.add(Tag.of("methodName", MessageFormat.format("{0}.{1}", className, methodName)));

        try {
            stopWatch.start();
            proceed = proceedingJoinPoint.proceed();
            stopWatch.stop();

            tags.add(Tag.of(TAG_EXECUTION_RESULT_NAME, TAG_EXECUTION_SUCCESS));
            meterRegistry.timer(TIMER_NAME, Tags.of(tags))
                    .record(Duration.ofMillis(stopWatch.getTotalTimeMillis()));
        } catch (Exception ex) {
            stopWatch.stop();
            tags.add(Tag.of(TAG_EXECUTION_RESULT_NAME, TAG_EXECUTION_FAIL));
            meterRegistry.timer(TIMER_NAME, Tags.of(tags))
                    .record(Duration.ofMillis(stopWatch.getTotalTimeMillis()));
            throw ex;
        }

        return proceed;
    }

}
