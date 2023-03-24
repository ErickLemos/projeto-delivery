package com.delivery.carteira.repositories.utils;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
public class UsuarioMetadata {

    @Field("user_id")
    private String id;

    @Field("email")
    private String email;

}
