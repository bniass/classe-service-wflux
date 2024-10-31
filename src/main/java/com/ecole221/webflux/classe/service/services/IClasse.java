package com.ecole221.webflux.classe.service.services;


import com.ecole221.webflux.classe.service.model.Classe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClasse {

    Flux<Classe> findAll();

    Mono<Classe> save(Classe classe);

    Mono<Classe> findByClasse(String libelle);

    Mono<Classe> findById(long id);

    Mono<Void> remove(Classe classe);
}
