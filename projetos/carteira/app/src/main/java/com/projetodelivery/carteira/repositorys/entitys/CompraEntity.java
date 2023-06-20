package com.projetodelivery.carteira.repositorys.entitys;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class CompraEntity {

    @Id
    private String id;

    @Field("valor")
    private BigDecimal valor;

    @Field("metodo_de_pagamento")
    private String metodoDePagamento;

}
