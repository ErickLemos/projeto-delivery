package com.projetodelivery.carteira.domain.compra.commands;

import com.projetodelivery.carteira.domain.compra.Compra;

public interface AdicionarCompraCommand {

    void salvar(Compra compra);

}
