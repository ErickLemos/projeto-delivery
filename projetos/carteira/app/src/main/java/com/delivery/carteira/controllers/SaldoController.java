package com.delivery.carteira.controllers;

import com.delivery.carteira.mappers.SaldoDtoMapper;
import com.delivery.carteira.controllers.dtos.SaldoDto;
import com.delivery.carteira.services.SaldoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/saldos")
@RequiredArgsConstructor
public class SaldoController {

    private final SaldoService saldoService;

    @GetMapping
    public ResponseEntity<List<SaldoDto>> get() {
        // TODO: id mockado, remover posteriormente
        var id = "123";

        var resultado = saldoService.buscarPorId(id);

        var dto = SaldoDtoMapper.INSTANCE.mapFrom(resultado);

        return ResponseEntity.ok(List.of(dto));
    }

    @PostMapping("{id}")
    public ResponseEntity<SaldoDto> post(
            @PathVariable("id") String id,
            @RequestBody SaldoDto saldoDtoRequest
    ) {

        var valorConvertido = Long.parseLong(saldoDtoRequest.getQuantidade());

        var resultado = saldoService.adicionar(
                id, BigDecimal.valueOf(valorConvertido)
        );

        return ResponseEntity.ok(
                SaldoDtoMapper.INSTANCE.mapFrom(resultado)
        );

    }

}
