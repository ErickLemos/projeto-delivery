package com.projetodelivery.carteira.commands.compra;

import com.projetodelivery.carteira.domain.compra.Compra;
import com.projetodelivery.carteira.domain.compra.CompraRepository;
import com.projetodelivery.carteira.domain.compra.commands.AdicionarCompraCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class AdicionarCompraCommandImpl implements AdicionarCompraCommand {

    private final CompraRepository compraRepository;

    @Override
    public void salvar(Compra compra) {
        compraRepository.salvar(compra);
    }

}
