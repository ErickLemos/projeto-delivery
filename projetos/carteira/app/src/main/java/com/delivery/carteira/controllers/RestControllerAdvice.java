package com.delivery.carteira.controllers;

import com.delivery.carteira.controllers.dtos.MensagemDto;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ConstraintViolationException.class})
    protected ResponseEntity<Object> handleConflict( ConstraintViolationException ex, WebRequest request) {
        return ResponseEntity.badRequest().body(MensagemDto.builder()
                .titulo("")
                .descricao("")
                .build()
        );
    }

}
