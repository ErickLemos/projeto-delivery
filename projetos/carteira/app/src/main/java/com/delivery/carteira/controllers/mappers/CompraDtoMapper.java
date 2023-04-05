package com.delivery.carteira.controllers.mappers;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.utils.mappers.MetodoDePagamentoMapper;
import com.delivery.carteira.controllers.dtos.CompraDtoRequest;
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

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    @Mapping(target = "utilizarSaldoNoPagamento", source = "utilizarSaldoNoPagamento")
    Compra mapFrom(CompraDtoRequest compraDtoRequest);


    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "metodoDePagamento", source = "metodoDePagamento")
    @Mapping(target = "tipoDeCompra", source = "tipoDeCompra")
    @Mapping(target = "utilizarSaldoNoPagamento", source = "utilizarSaldoNoPagamento")
    CompraDtoRequest mapFrom(Compra domain);

}
