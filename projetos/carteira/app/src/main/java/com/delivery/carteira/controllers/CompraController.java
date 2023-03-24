package com.delivery.carteira.controllers;

import com.delivery.carteira.mappers.CompraDtoMapper;
import com.delivery.carteira.controllers.dtos.CompraDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @PostMapping
    public ResponseEntity<CompraDto> adicionarCompra(@RequestBody CompraDto dto) {

        var domain = CompraDtoMapper.INSTANCE.mapFrom(dto);

        var dtoMapeado = CompraDtoMapper.INSTANCE.mapFrom(domain);

        return ResponseEntity.ok(dtoMapeado);
    }

}
