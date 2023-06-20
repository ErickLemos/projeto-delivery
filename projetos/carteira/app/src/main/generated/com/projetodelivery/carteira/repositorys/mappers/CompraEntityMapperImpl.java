package com.projetodelivery.carteira.repositorys.mappers;

import com.projetodelivery.carteira.core.mappers.CommonsMapper;
import com.projetodelivery.carteira.core.mappers.MetodoDePagamentoMapper;
import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.domain.compra.enums.MetodoDePagamento;
import com.projetodelivery.carteira.repositorys.entitys.CompraEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T21:46:18-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (GraalVM Community)"
)
public class CompraEntityMapperImpl implements CompraEntityMapper {

    @Override
    public Compra mapFrom(CompraEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Compra.CompraBuilder compra = Compra.builder();

        compra.id( entity.getId() );
        if ( entity.getMetodoDePagamento() != null ) {
            compra.metodoDePagamento( Enum.valueOf( MetodoDePagamento.class, entity.getMetodoDePagamento() ) );
        }
        compra.valor( entity.getValor() );

        return compra.build();
    }

    @Override
    public CompraEntity mapFrom(Compra domain) {
        if ( domain == null ) {
            return null;
        }

        CompraEntity.CompraEntityBuilder compraEntity = CompraEntity.builder();

        compraEntity.id( domain.getId() );
        if ( domain.getMetodoDePagamento() != null ) {
            compraEntity.metodoDePagamento( domain.getMetodoDePagamento().name() );
        }
        compraEntity.valor( domain.getValor() );

        return compraEntity.build();
    }
}
