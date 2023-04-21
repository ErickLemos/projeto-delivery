package com.delivery.carteira.controllers;

import com.delivery.carteira.controllers.dtos.CompraDtoRequest;
import com.delivery.carteira.controllers.dtos.MensagemDto;
import com.delivery.carteira.controllers.mappers.CompraDtoMapper;
import com.delivery.carteira.services.CompraService;
import jakarta.validation.Valid;
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
    public ResponseEntity<MensagemDto> adicionarCompra( @Valid @RequestBody CompraDtoRequest dto ) {

        var domain = CompraDtoMapper.INSTANCE.mapFrom(dto);
        compraService.adicionar(domain);

        return ResponseEntity.ok(MensagemDto.builder()
                .titulo("compra realizada")
                .descricao("sua compra foi realizada com sucesso!")
                .build()
        );
    }

}
