package com.ecole221.webflux.classe.service;

import com.ecole221.webflux.classe.service.repository.ClasseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.ecole221.webflux.classe.service")
class ClasseTestConfiguration {

	@Bean
	public ClasseRepository classeRepositoryTest(){
		return Mockito.mock(ClasseRepository.class);
	}

}
