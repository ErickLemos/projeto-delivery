package com.projetodelivery.carteira.repositorys.adapters;

import com.projetodelivery.carteira.core.exceptions.EntidadeNaoEncontradaException;
import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.domain.compra.CompraRepository;
import com.projetodelivery.carteira.repositorys.interfaces.CompraMongoRepository;
import com.projetodelivery.carteira.repositorys.mappers.CompraEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class CompraRepositoryImpl implements CompraRepository {

    private final CompraMongoRepository compraMongoRepository;

    @Override
    public List<Compra> buscarTodos() {
        return compraMongoRepository.findAll().stream()
                .map(CompraEntityMapper.INSTANCE::mapFrom)
                .toList();
    }

    @Override
    public Compra buscarPorId(String id) {
        return compraMongoRepository.findById(id)
                .map(CompraEntityMapper.INSTANCE::mapFrom)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("compra não foi encontrada"));
    }

    @Override
    public void salvar(Compra domain) {

        var entity = CompraEntityMapper.INSTANCE.mapFrom(domain);

        compraMongoRepository.save(entity);

    }

    @Override
    public void excluir(Compra domain) {

        Objects.requireNonNull(domain.getId());
        compraMongoRepository.deleteById(domain.getId());

    }

}
