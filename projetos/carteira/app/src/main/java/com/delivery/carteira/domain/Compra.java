package com.delivery.carteira.domain;


import com.delivery.carteira.domain.enums.MetodoDePagamento;
import com.delivery.carteira.domain.enums.TipoDeCompra;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Compra {

    private String id;
    private BigDecimal valor;
    private MetodoDePagamento metodoDePagamento;
    private TipoDeCompra tipoDeCompra;
    private Boolean utilizarSaldoNoPagamento;

}
