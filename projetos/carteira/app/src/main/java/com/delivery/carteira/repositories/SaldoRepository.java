package com.delivery.carteira.repositories;

import com.delivery.carteira.models.SaldoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface SaldoRepository extends MongoRepository<SaldoEntity, String> {

}
