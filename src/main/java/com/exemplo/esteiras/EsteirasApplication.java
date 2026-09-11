package com.exemplo.esteiras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EsteirasApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsteirasApplication.class, args);
    }

    @GetMapping("/")
    public String olaMundo() {
        return "Este foi um simplles teste de CI/CD.\nAPI Java rodando com sucesso no meu pipeline de CI/CD!";
    }
}
