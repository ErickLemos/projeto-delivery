package com.projetodelivery.carteira.repositorys.interfaces;

import com.projetodelivery.carteira.repositorys.entitys.CompraEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraMongoRepository extends MongoRepository<CompraEntity, String> {
}
