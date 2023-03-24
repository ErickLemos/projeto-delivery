package com.delivery.carteira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

// TODO: implementar validacoes de entradas

@SpringBootApplication
public class CarteiraApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarteiraApplication.class, args);
    }

}
