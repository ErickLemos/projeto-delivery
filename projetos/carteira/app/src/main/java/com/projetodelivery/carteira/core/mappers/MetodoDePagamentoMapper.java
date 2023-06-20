package com.projetodelivery.carteira.core.mappers;

import com.projetodelivery.carteira.domain.compra.enums.MetodoDePagamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface MetodoDePagamentoMapper {

    MetodoDePagamentoMapper INSTANCE = Mappers.getMapper(MetodoDePagamentoMapper.class);

    default MetodoDePagamento mapFrom(String valor) {
        return Optional.of(valor)
                .map(MetodoDePagamento::entryOf)
                .orElse(null);
    }

    default String mapFrom(MetodoDePagamento valor) {
        return Optional.of(valor)
                .map(MetodoDePagamento::getValor)
                .orElse(null);
    }

}
