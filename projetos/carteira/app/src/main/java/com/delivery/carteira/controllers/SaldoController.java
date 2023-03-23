package com.delivery.carteira.controllers;

import com.delivery.carteira.mappers.SaldoDtoMapper;
import com.delivery.carteira.models.dtos.SaldoDto;
import com.delivery.carteira.models.entities.SaldoEntity;
import com.delivery.carteira.services.SaldoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

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
    public ResponseEntity<SaldoDto> post(@RequestBody SaldoDto saldoDtoRequest) {

        var resultado = saldoService.adicionar(
                saldoDtoRequest.getId(),
                BigDecimal.valueOf(Long.parseLong(saldoDtoRequest.getQuantidade()))
        );

        return ResponseEntity.ok(
                SaldoDtoMapper.INSTANCE.mapFrom(resultado)
        );

    }

}
