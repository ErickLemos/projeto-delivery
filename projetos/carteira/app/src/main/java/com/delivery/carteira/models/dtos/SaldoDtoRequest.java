package com.delivery.carteira.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SaldoDtoRequest {

    // TODO: remover depois
    @JsonProperty("id")
    private String id;

    @JsonProperty("quantidade")
    private BigDecimal quantidade;

}
