package com.delivery.carteira.core.monitorable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MonitorableConfiguration {

    @Bean
    public MonitorableProfiler monitorableProfiler() {
        return new MonitorableProfiler();
    }

}
