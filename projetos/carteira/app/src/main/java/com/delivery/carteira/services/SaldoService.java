package com.delivery.carteira.services;

import com.delivery.carteira.models.entities.SaldoEntity;
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

        var saldoDoUsuario = saldoRepository.findById(id)
                .orElseGet(() -> saldoRepository.save(
                        SaldoEntity.builder()
                                .id(id)
                                .quantidade(BigDecimal.ZERO)
                                .build()
                ));

        saldoDoUsuario.adicionarSaldo(saldoParaAdicionar);
        return saldoRepository.save(saldoDoUsuario);

    }

}
