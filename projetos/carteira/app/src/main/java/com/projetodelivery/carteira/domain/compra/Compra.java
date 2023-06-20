package com.projetodelivery.carteira.domain.compra;

import com.projetodelivery.carteira.domain.compra.enums.MetodoDePagamento;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

    private String id;
    private BigDecimal valor;
    private MetodoDePagamento metodoDePagamento;

}
