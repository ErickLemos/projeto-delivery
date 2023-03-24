package com.delivery.carteira.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum TipoDeCompra {
    PEDIDO("pedido"),
    ADICAO_DE_SALDO("adicao_de_saldo");

    private final String tipo;

    static public TipoDeCompra entryOf(String valor) {
        return Arrays.stream(values())
                .filter(obj -> obj.tipo.equals(valor))
                .findFirst()
                .orElse(null);
    }
}
