package com.delivery.carteira.repositories.mappers;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.repositories.entities.CompraEntity;
import com.delivery.carteira.repositories.utils.EntityMetadata;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompraEntityMapper {

    CompraEntityMapper INSTANCE = Mappers.getMapper(CompraEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    @Mapping(target = "entityMetadata", ignore = true)
    CompraEntity mapFrom(Compra compra);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    Compra mapFrom(CompraEntity compraEntity);

    @AfterMapping
    default void after(@MappingTarget CompraEntity compraEntity) {
        compraEntity.setEntityMetadata(new EntityMetadata());
    }

}
