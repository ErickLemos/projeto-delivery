package com.projetodelivery.carteira.domain.compra;

import com.projetodelivery.carteira.domain.utils.RepositoryBase;

import java.util.List;

public interface CompraRepository extends RepositoryBase<Compra> {

    List<Compra> buscarTodos();

    Compra buscarPorId(String id);

}
