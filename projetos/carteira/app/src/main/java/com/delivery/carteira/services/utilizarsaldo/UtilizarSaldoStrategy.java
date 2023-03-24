package com.delivery.carteira.services.utilizarsaldo;

import com.delivery.carteira.domain.Compra;

public interface UtilizarSaldoStrategy {

    void process(Compra compra);

}
