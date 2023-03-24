package com.delivery.carteira.utils.mappers;

import com.delivery.carteira.domain.enums.MetodoDePagamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface MetodoDePagamentoMapper {

    MetodoDePagamentoMapper INSTANCE = Mappers.getMapper(MetodoDePagamentoMapper.class);

    default MetodoDePagamento mapFrom(String valor) {
        return Optional.ofNullable(valor)
                .map(obj -> MetodoDePagamento.entryOf(valor))
                .orElse(null);
    }

    default String mapFrom(MetodoDePagamento valor) {
        return valor.getTipo();
    }

}
