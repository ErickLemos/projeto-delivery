package com.projetodelivery.carteira.rest.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompraDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("metodo_de_pagamento")
    private String metodoDePagamento;

}
