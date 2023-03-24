package com.delivery.carteira.repositories.utils;

import com.delivery.carteira.utils.auth.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.oauth2.jwt.Jwt;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntityMetadata {

    @CreatedBy
    @Field("usuario")
    private UsuarioMetadata usuario;

    @CreatedDate
    @Field("criado_em")
    private Instant criadoEm;

    @LastModifiedBy
    @Field("ultimo_usuario")
    private UsuarioMetadata ultimoUsuario;

    @LastModifiedDate
    @Field("modificado_em")
    private Instant modificadoEm;

}
