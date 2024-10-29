package com.ecole221.webflux.classe.service.repository;

import com.ecole221.webflux.classe.service.model.Filiere;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends ReactiveCrudRepository<Filiere, Long> {
}
