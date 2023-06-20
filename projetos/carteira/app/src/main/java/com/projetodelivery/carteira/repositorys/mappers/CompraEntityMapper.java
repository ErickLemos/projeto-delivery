package com.projetodelivery.carteira.repositorys.mappers;

import com.projetodelivery.carteira.core.mappers.CommonsMapper;
import com.projetodelivery.carteira.core.mappers.MetodoDePagamentoMapper;
import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.repositorys.entitys.CompraEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {
        CommonsMapper.class,
        MetodoDePagamentoMapper.class
})
public interface CompraEntityMapper {

    CompraEntityMapper INSTANCE = Mappers.getMapper(CompraEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "valor", source = "valor")
    Compra mapFrom(CompraEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "valor", source = "valor")
    CompraEntity mapFrom(Compra domain);

}
