package com.delivery.carteira.repositories;

import com.delivery.carteira.repositories.entities.SaldoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaldoRepository extends MongoRepository<SaldoEntity, String> {
}
