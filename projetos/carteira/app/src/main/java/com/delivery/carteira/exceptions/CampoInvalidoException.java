package com.delivery.carteira.exceptions;

import lombok.Getter;

@Getter
public class CampoInvalidoException extends RuntimeException{
    private final String titulo;
    private final String descricao;

    public CampoInvalidoException(String titulo, String descricao) {
        this.descricao = descricao;
        this.titulo = titulo;
    }
}
