package com.projetodelivery.carteira.domain.utils;

public interface RepositoryBase<T> {

    void salvar(T domain);

    void excluir(T domain);

}
