package com.example.vet_cristo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class VetCristoApplication {

    public static void main(String[] args) {

        SpringApplication.run(VetCristoApplication.class, args);
        log.info("Hola mundo.........");
    }

}
