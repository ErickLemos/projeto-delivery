package com.delivery.carteira.mappers.commons;

import com.delivery.carteira.domain.enums.TipoDeCompra;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface TipoDeCompraMapper {

    TipoDeCompraMapper INSTANCE = Mappers.getMapper(TipoDeCompraMapper.class);

    default TipoDeCompra mapFrom(String valor) {
        return Optional.ofNullable(valor)
                .map(obj -> TipoDeCompra.entryOf(valor))
                .orElse(null);
    }

    default String mapFrom(TipoDeCompra valor) {
        return valor.getTipo();
    }

}
