package com.ecole221.webflux.classe.service;

import com.ecole221.webflux.classe.service.repository.ClasseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;
import static  org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = ClasseTestConfiguration.class, properties = {
        "logging.level.org.springframework.r2dbc=DEBUG"
})
public class ClasseRepositoryTest {
    @Autowired
    private ClasseRepository classeRepository;

    @Test
    public void findAll(){
        classeRepository.findAll()
                .doOnNext(classe -> log.info("{}", classe))
                .as(StepVerifier::create)
                .expectNextCount(15)
                .expectComplete().verify();
    }

    @Test
    public void findById(){
        classeRepository.findById(7L)
                .doOnNext(classe -> log.info("{}", classe))
                .as(StepVerifier::create)
                .assertNext(classe -> Assertions.assertEquals("Comptabilité 2ème Année", classe.getLibelle()))
                .expectComplete()
                .verify();

    }

    @Test
    public void findByIdWithNoExistingId(){
        assertThatExceptionOfType(AssertionError.class).
                isThrownBy(()->StepVerifier.create(classeRepository.findById(16L))
                        .recordWith(()->null)
                        .expectComplete().verify()
                ).withMessage("expectation \"recordWith\" failed (expected collection; actual supplied is [null])");
    }

    @Test
    public void findByIdWithNoExistingIdBis(){
        classeRepository.findById(20L)
                .as(StepVerifier::create)
                .expectNextCount(0)
                .expectComplete()
                .verify();

    }

    @Test
    public void findBMensualiteByRange(){
        classeRepository.findByMensualiteBetween(22000, 26000)
                .doOnNext(classe -> log.info("{}", classe))
                .as(StepVerifier::create)
                //.expectNextCount(8)
                .assertNext(classe -> Assertions.assertEquals(25000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(22000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(23000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(25000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(26000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(25000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(23000, classe.getMensualite()))
                .assertNext(classe -> Assertions.assertEquals(25000, classe.getMensualite()))

                .expectComplete()
                .verify();

    }




}
