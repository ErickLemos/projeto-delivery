package com.delivery.carteira.repositories;

import com.delivery.carteira.repositories.entities.CompraEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends MongoRepository<CompraEntity, String> {
}
