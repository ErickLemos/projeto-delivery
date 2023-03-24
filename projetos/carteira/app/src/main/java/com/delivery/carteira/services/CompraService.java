package com.delivery.carteira.services;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.repositories.CompraRepository;
import com.delivery.carteira.repositories.mappers.CompraEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository compraRepository;

    public Compra adicionarCompra(Compra compra) {

        var entity = CompraEntityMapper.INSTANCE.mapFrom(compra);

        var entitySalva = compraRepository.save(entity);

        return CompraEntityMapper.INSTANCE.mapFrom(entitySalva);

    }

}
