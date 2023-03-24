package com.delivery.carteira.services.utilizarsaldo;

import com.delivery.carteira.domain.Compra;
import org.springframework.stereotype.Component;

@Component
public class NaoUtilizarSaldoStrategyImpl implements UtilizarSaldoStrategy {

    @Override
    public void process(Compra compra) {

    }

}
