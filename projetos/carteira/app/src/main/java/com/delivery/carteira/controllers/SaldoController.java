package com.delivery.carteira.controllers;

import com.delivery.carteira.models.SaldoEntity;
import com.delivery.carteira.models.dtos.SaldoDtoRequest;
import com.delivery.carteira.services.SaldoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saldo")
@RequiredArgsConstructor
public class SaldoController {

    private final SaldoService saldoService;

    @GetMapping
    public ResponseEntity<SaldoEntity> get() {
        // TODO: id mockado, remover posteriormente
        var id = "123";

        var resultado = saldoService.buscarPorId(id);

        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<SaldoEntity> post(@RequestBody SaldoDtoRequest saldoDtoRequest) {

        var resultado = saldoService.adicionar(
                saldoDtoRequest.getId(),
                saldoDtoRequest.getQuantidade()
        );

        return ResponseEntity.ok(resultado);

    }

}
