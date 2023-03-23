package com.delivery.carteira.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaldoDto {

    // JsonProperty é utilizado para nomear o campo quando sai da api rest
    @JsonProperty("id")
    private String id;

    @JsonProperty("quantidade")
    private String quantidade;

}
