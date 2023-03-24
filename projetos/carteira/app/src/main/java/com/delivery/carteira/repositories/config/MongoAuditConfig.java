package com.delivery.carteira.repositories.config;

import com.delivery.carteira.repositories.utils.UsuarioMetadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoAuditConfig {

    @Bean
    public AuditorAware<UsuarioMetadata> myAuditorProvider() {
        return new JwtAuditManager();
    }

}
