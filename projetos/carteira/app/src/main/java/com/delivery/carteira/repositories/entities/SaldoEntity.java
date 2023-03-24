package com.delivery.carteira.repositories.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("saldo_entity")
public class SaldoEntity {

    @Id
    private String id;
    private BigDecimal quantidade;

    public void adicionarSaldo(BigDecimal saldo) {
        this.quantidade = quantidade.add(saldo);
    }

}
