package com.delivery.carteira.services.interfaces;

import com.delivery.carteira.domain.Compra;

public interface UtilizarSaldoStrategy {

    void process(Compra compra);

}
