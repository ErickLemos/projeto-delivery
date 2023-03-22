package com.delivery.carteira.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document("saldo_entity")
@NoArgsConstructor
public class SaldoEntity {

    @Id
    private String id;
    private BigDecimal quantidade;

}
