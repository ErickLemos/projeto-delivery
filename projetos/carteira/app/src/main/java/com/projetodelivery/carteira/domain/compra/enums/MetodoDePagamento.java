package com.projetodelivery.carteira.domain.compra.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum MetodoDePagamento {
    CREDITO("CREDITO"),
    DEBITO("DEBITO"),
    PIX("PIX");

    private final String valor;

    public static MetodoDePagamento entryOf(String valor) {
        return Arrays.stream(MetodoDePagamento.values())
                .filter(obj -> obj.valor.equals(valor))
                .findFirst()
                .orElse(null);
    }
}
