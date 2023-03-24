package com.delivery.carteira.repositories.entities;

import com.delivery.carteira.repositories.utils.EntityMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("compras")
public class CompraEntity {

    @Field("metadata")
    private EntityMetadata entityMetadata;

    @Id
    private String id;
    private String valor;

    @Field("metodo_de_pagamento")
    private String metodoDePagamento;

    @Field("tipo_de_compra")
    private String tipoDeCompra;

    @Field("utilizar_saldo_no_pagamento")
    private Boolean utilizarSaldoNoPagamento;

}
