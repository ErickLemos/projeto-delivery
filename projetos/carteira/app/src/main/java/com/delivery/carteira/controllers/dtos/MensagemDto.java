package com.delivery.carteira.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MensagemDto {

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("payload")
    private Object payload;

}
