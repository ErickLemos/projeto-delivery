package com.delivery.carteira.models.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@Document("saldo_entity")
public class SaldoEntity {

    @Id
    private String id;
    private BigDecimal quantidade;

    public void adicionarSaldo(BigDecimal saldo) {
        this.quantidade = quantidade.add(saldo);
    }

}
