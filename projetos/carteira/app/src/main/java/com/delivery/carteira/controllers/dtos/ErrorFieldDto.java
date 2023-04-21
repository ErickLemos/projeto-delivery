package com.delivery.carteira.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorFieldDto {

    @JsonProperty("nome_do_campo")
    private String nome;

    @JsonProperty("motivo_do_erro")
    private String motivo;

}
