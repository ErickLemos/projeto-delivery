package com.delivery.carteira.utils.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {

    private String id;
    private String nome;
    private String email;

}
