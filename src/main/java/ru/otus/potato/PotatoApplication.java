package ru.otus.potato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

/**
 * Api для робота, который добавляет соус к картошке (всего-навсего).
 */
@EnableIntegration
@IntegrationComponentScan
@SpringBootApplication
public class PotatoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotatoApplication.class, args);
    }
}

