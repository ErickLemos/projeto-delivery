package com.delivery.carteira.mappers;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.mappers.commons.MetodoDePagamentoMapper;
import com.delivery.carteira.controllers.dtos.CompraDto;
import com.delivery.carteira.mappers.commons.TipoDeCompraMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        MetodoDePagamentoMapper.class,
        TipoDeCompraMapper.class
})
public interface CompraDtoMapper {

    CompraDtoMapper INSTANCE = Mappers.getMapper(CompraDtoMapper.class);

    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    @Mapping(target = "utilizarSaldoNoPagamento", source = "utilizarSaldoNoPagamento")
    Compra mapFrom(CompraDto compraDto);

    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    @Mapping(target = "utilizarSaldoNoPagamento", source = "utilizarSaldoNoPagamento")
    CompraDto mapFrom(Compra domain);

}
