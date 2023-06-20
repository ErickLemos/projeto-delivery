package com.projetodelivery.carteira.commands.compra;

import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.domain.compra.CompraRepository;
import com.projetodelivery.carteira.domain.compra.querys.BuscarComprasQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarComprasQueryImpl implements BuscarComprasQuery {

    private final CompraRepository compraRepository;

    @Override
    public List<Compra> buscar() {
        return compraRepository.buscarTodos();
    }

}
