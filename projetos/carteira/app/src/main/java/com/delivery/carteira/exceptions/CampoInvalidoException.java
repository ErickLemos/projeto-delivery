package com.delivery.carteira.exceptions;

import lombok.Getter;

@Getter
public class CampoInvalidoException extends RuntimeException{
    private String titulo;
    private String descricao;

    public CampoInvalidoException(String titulo, String descricao) {
        this.descricao = descricao;
        this.titulo = titulo;
    }
}
