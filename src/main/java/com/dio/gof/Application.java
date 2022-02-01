package com.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados
 * Spring Data JPA
 * Spring web
 * H2 Database
 * OpenFeign
 *
 * @author PauloProgram
 */

@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
