package com.delivery.carteira.services.utilizarsaldo;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.services.interfaces.UtilizarSaldoStrategy;
import org.springframework.stereotype.Component;

@Component
public class UtilizarSaldoStrategyImpl implements UtilizarSaldoStrategy {

    @Override
    public void process(Compra compra) {
        // TODO: IMPLEMENTAR LOGICA PARA UTILIZAR SALDO
    }

}