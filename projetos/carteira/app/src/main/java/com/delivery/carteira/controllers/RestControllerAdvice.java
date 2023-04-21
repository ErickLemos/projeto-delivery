package com.delivery.carteira.controllers;

import com.delivery.carteira.controllers.dtos.ErrorFieldDto;
import com.delivery.carteira.controllers.dtos.MensagemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestControllerAdvice {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    protected ResponseEntity<Object> handleConflict(MethodArgumentNotValidException ex, WebRequest request) {
        var listaDeErros = ex.getBindingResult().getFieldErrors().stream()
                .map(obj -> ErrorFieldDto.builder()
                        .nome(obj.getField())
                        .motivo(obj.getDefaultMessage())
                        .build()
                ).toList();

        return ResponseEntity.badRequest().body(MensagemDto.builder()
                .titulo("objeto inválido")
                .descricao("objeto não atende os requisitos necessários")
                .payload(listaDeErros)
                .build()
        );
    }

}
