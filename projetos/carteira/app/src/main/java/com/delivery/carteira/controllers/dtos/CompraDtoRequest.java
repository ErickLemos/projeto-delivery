package com.delivery.carteira.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompraDtoRequest {

    @Min(value = 1, message = "o valor deve ser maior que um")
    @JsonProperty("valor")
    private Double valor;

    @NotEmpty(message = "metodo de pagamento deve ser preenchido")
    @JsonProperty("metodo_de_pagamento")
    private String metodoDePagamento;

    @NotEmpty(message = "tipo de compra deve ser preenchido")
    @JsonProperty("tipo_de_compra")
    private String tipoDeCompra;

    @JsonProperty("utilizar_saldo_no_pagamento")
    private Boolean utilizarSaldoNoPagamento;

}
