package com.ecole221.webflux.classe.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.ecole221.webflux.classe.service")
public class ClasseServiceWfluxApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClasseServiceWfluxApplication.class, args);
	}
}
