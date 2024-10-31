package com.ecole221.webflux.classe.service.services;

import com.ecole221.webflux.classe.service.model.Filiere;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFiliere {
    Mono<Filiere> save(Filiere filiere);
    Mono<Filiere> findById(long id);
    Flux<Filiere> findAll();
    void  remove(long id);
}
