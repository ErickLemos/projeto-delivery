package com.delivery.carteira.controllers.mappers;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.utils.mappers.MetodoDePagamentoMapper;
import com.delivery.carteira.controllers.dtos.CompraDto;
import com.delivery.carteira.utils.mappers.TipoDeCompraMapper;
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
