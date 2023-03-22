package com.delivery.carteira.repositories;

import com.delivery.carteira.models.entities.SaldoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaldoRepository extends MongoRepository<SaldoEntity, String> {
}
