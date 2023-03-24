package com.delivery.carteira.mappers;

import com.delivery.carteira.controllers.dtos.SaldoDto;
import com.delivery.carteira.repositories.entities.SaldoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

// estrutura basica de um mapper
@Mapper
public interface SaldoDtoMapper {

    SaldoDtoMapper INSTANCE = Mappers.getMapper(SaldoDtoMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "quantidade", source = "quantidade")
    SaldoDto mapFrom(SaldoEntity saldoEntity);

}
