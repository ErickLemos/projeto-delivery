package com.delivery.carteira.repositories.config;

import com.delivery.carteira.repositories.utils.UsuarioMetadata;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Optional;

public class JwtAuditManager implements AuditorAware<UsuarioMetadata> {

    @Override
    public Optional<UsuarioMetadata> getCurrentAuditor() {
        return Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication)
                .filter(Authentication::isAuthenticated)
                .map(Authentication::getPrincipal)
                .map(Jwt.class::cast)
                .map(jwt -> UsuarioMetadata.builder()
                        .id(jwt.getClaim("user_id"))
                        .email(jwt.getClaim("email"))
                        .build()
                );
    }

}

