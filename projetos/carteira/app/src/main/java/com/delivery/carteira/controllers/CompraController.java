package com.delivery.carteira.controllers;

import com.delivery.carteira.controllers.mappers.CompraDtoMapper;
import com.delivery.carteira.controllers.dtos.CompraDto;
import com.delivery.carteira.services.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/compras")
public class CompraController {

    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<CompraDto> adicionarCompra(@RequestBody CompraDto dto) {

        var domain = CompraDtoMapper.INSTANCE.mapFrom(dto);

        var compraSalva = compraService.adicionarCompra(domain);

        var dtoMapeado = CompraDtoMapper.INSTANCE.mapFrom(compraSalva);

        return ResponseEntity.ok(dtoMapeado);
    }

}
