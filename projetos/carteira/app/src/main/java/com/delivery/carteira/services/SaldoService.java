package com.delivery.carteira.services;

import com.delivery.carteira.models.SaldoEntity;
import com.delivery.carteira.repositories.SaldoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class SaldoService {

    private final SaldoRepository saldoRepository;

    public SaldoEntity buscarPorId(String id) {
        return saldoRepository.findById(id)
                .orElseThrow();
    }

    public SaldoEntity adicionar(String id, BigDecimal saldoParaAdicionar) {

        var saldoDoUsuario = saldoRepository.findById(id);

        if (saldoDoUsuario.isEmpty()) {
            var saldoNovo = new SaldoEntity();
            saldoNovo.setId(id);
            saldoNovo.setQuantidade(BigDecimal.ZERO);
            saldoRepository.save(saldoNovo);
        }

        var saldoFinal = saldoDoUsuario.get().getQuantidade()
                .add(saldoParaAdicionar);

        saldoDoUsuario.get().setQuantidade(saldoFinal);

        return saldoRepository.save(saldoDoUsuario.get());

    }

}
