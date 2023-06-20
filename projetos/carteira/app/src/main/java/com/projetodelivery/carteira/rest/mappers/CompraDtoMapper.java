package com.projetodelivery.carteira.rest.mappers;

import com.projetodelivery.carteira.core.mappers.CommonsMapper;
import com.projetodelivery.carteira.core.mappers.MetodoDePagamentoMapper;
import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.rest.dtos.CompraDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {
        CommonsMapper.class,
        MetodoDePagamentoMapper.class
})
public interface CompraDtoMapper {

    CompraDtoMapper INSTANCE = Mappers.getMapper(CompraDtoMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "valor", source = "valor")
    Compra mapFrom(CompraDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "valor", source = "valor")
    CompraDto mapFrom(Compra domain);

}
