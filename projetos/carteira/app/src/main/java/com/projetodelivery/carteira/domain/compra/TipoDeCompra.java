package com.projetodelivery.carteira.domain.compra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoDeCompra {
    CREDITO("CREDITO"),
    DEBITO("DEBITO"),
    PIX("PIX");

    private final String valor;
}
