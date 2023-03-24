package com.delivery.carteira.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum MetodoDePagamento {
    DINHEIRO("dinheiro"),
    CARTAO_DEBITO("cartao_debito"),
    CARTAO_CREDITO("cartao_credito");

    private final String tipo;

    static public MetodoDePagamento entryOf(String valor) {
        return Arrays.stream(values())
                .filter(obj -> obj.tipo.equals(valor))
                .findFirst()
                .orElse(null);
    }
}
