package com.projetodelivery.carteira.rest.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensagemDto {

    private String titulo;
    private String descricao;

}
