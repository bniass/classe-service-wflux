package com.ecole221.webflux.classe.service.repository;

import com.ecole221.webflux.classe.service.model.Classe;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ClasseRepository extends ReactiveCrudRepository<Classe, Long> {

    Flux<Classe> findByMensualiteBetween(int from, int to);

}
