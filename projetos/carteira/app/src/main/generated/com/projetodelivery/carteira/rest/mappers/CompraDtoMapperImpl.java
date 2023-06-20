package com.projetodelivery.carteira.rest.mappers;

import com.projetodelivery.carteira.core.mappers.CommonsMapper;
import com.projetodelivery.carteira.core.mappers.MetodoDePagamentoMapper;
import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.domain.compra.enums.MetodoDePagamento;
import com.projetodelivery.carteira.rest.dtos.CompraDto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T21:55:58-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (GraalVM Community)"
)
public class CompraDtoMapperImpl implements CompraDtoMapper {

    @Override
    public Compra mapFrom(CompraDto dto) {
        if ( dto == null ) {
            return null;
        }

        Compra.CompraBuilder compra = Compra.builder();

        compra.id( dto.getId() );
        if ( dto.getMetodoDePagamento() != null ) {
            compra.metodoDePagamento( Enum.valueOf( MetodoDePagamento.class, dto.getMetodoDePagamento() ) );
        }
        if ( dto.getValor() != null ) {
            compra.valor( new BigDecimal( dto.getValor() ) );
        }

        return compra.build();
    }

    @Override
    public CompraDto mapFrom(Compra domain) {
        if ( domain == null ) {
            return null;
        }

        CompraDto.CompraDtoBuilder compraDto = CompraDto.builder();

        compraDto.id( domain.getId() );
        if ( domain.getMetodoDePagamento() != null ) {
            compraDto.metodoDePagamento( domain.getMetodoDePagamento().name() );
        }
        if ( domain.getValor() != null ) {
            compraDto.valor( domain.getValor().toString() );
        }

        return compraDto.build();
    }
}
