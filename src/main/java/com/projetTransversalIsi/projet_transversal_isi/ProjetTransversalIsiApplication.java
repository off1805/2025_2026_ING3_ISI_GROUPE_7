package com.projetTransversalIsi.projet_transversal_isi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"Models"})
public class ProjetTransversalIsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetTransversalIsiApplication.class, args);
    }

}
