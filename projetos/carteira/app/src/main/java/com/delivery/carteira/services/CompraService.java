package com.delivery.carteira.services;

import com.delivery.carteira.domain.Compra;
import com.delivery.carteira.repositories.CompraRepository;
import com.delivery.carteira.repositories.mappers.CompraEntityMapper;
import com.delivery.carteira.services.utilizarsaldo.NaoUtilizarSaldoStrategyImpl;
import com.delivery.carteira.services.interfaces.UtilizarSaldoStrategy;
import com.delivery.carteira.services.utilizarsaldo.UtilizarSaldoStrategyImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository compraRepository;
    private final NaoUtilizarSaldoStrategyImpl naoUtilizarSaldoStrategy;
    private final UtilizarSaldoStrategyImpl utilizarSaldoStrategy;

    public Compra adicionarCompra(Compra compra) {

        var utilizarSaldo = buildUtilizarSaldo(compra.getUtilizarSaldoNoPagamento());
        utilizarSaldo.process(compra);

        var entity = CompraEntityMapper.INSTANCE.mapFrom(compra);
        var entitySalva = compraRepository.save(entity);

        return CompraEntityMapper.INSTANCE.mapFrom(entitySalva);

    }

    private UtilizarSaldoStrategy buildUtilizarSaldo(Boolean valor) {
        return Optional.ofNullable(valor)
                .map(obj -> valor ? utilizarSaldoStrategy : naoUtilizarSaldoStrategy)
                .orElse(naoUtilizarSaldoStrategy);
    }

}
