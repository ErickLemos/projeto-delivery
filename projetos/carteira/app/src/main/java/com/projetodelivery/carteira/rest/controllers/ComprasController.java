package com.projetodelivery.carteira.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("hello world");
    }

}
