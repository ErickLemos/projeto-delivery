package com.projetodelivery.carteira.rest.controllers;

import com.projetodelivery.carteira.domain.compra.commands.AdicionarCompraCommand;
import com.projetodelivery.carteira.domain.compra.querys.BuscarComprasQuery;
import com.projetodelivery.carteira.rest.dtos.CompraDto;
import com.projetodelivery.carteira.rest.dtos.MensagemDto;
import com.projetodelivery.carteira.rest.mappers.CompraDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/compras")
public class ComprasController {

    private final BuscarComprasQuery buscarComprasQuery;
    private final AdicionarCompraCommand adicionarCompraCommand;

    @GetMapping
    public ResponseEntity<List<CompraDto>> get() {

        var compras = buscarComprasQuery.buscar();

        var dtos = compras.stream()
                .map(CompraDtoMapper.INSTANCE::mapFrom)
                .toList();

        return ResponseEntity.ok(dtos);
    }


    @PostMapping
    public ResponseEntity<MensagemDto> adicionar(@RequestBody CompraDto dto) {

        var compra = CompraDtoMapper.INSTANCE.mapFrom(dto);

        adicionarCompraCommand.salvar(compra);

        return ResponseEntity.ok(MensagemDto.builder()
                .titulo("compra adicionada")
                .descricao("compra foi adicionada com sucesso")
                .build());
    }

}
