package com.projetodelivery.carteira.core.mappers;

import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Optional;

@Mapper
public interface CommonsMapper {

    default BigDecimal mapFrom(String valor) {
        return Optional.of(valor)
                .map(Double::valueOf)
                .map(BigDecimal::valueOf)
                .orElse(null);
    }

    default String mapFrom(BigDecimal valor) {
        return Optional.of(valor)
                .map(BigDecimal::toString)
                .orElse(null);
    }

}
