package com.delivery.carteira.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompraDtoRequest {

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("metodo_de_pagamento")
    private String metodoDePagamento;

    @JsonProperty("tipo_de_compra")
    private String tipoDeCompra;

    @JsonProperty("utilizar_saldo_no_pagamento")
    private Boolean utilizarSaldoNoPagamento;

}
