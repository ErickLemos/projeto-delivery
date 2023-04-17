package com.delivery.carteira.controllers;

import com.delivery.carteira.controllers.dtos.MensagemDto;
import com.delivery.carteira.exceptions.CampoInvalidoException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CampoInvalidoException.class})
    protected ResponseEntity<Object> handleConflict( CampoInvalidoException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return ResponseEntity.badRequest().body(MensagemDto.builder()
                .titulo(ex.getTitulo())
                .descricao(ex.getDescricao())
                .build()
        );
    }

}
