package com.ecole221.webflux.classe.service.controllers;



import com.ecole221.webflux.classe.service.dto.ClasseCreateRequest;
import com.ecole221.webflux.classe.service.dto.ClasseCreateResponse;
import com.ecole221.webflux.classe.service.exception.ClasseServiceNotFoundException;
import com.ecole221.webflux.classe.service.helper.ClasseHelper;
import com.ecole221.webflux.classe.service.mapper.Mapper;
import com.ecole221.webflux.classe.service.services.IClasse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/classes")
public class ClasseController {


    private final Mapper mapper;
    private final ClasseHelper classeHelper;
    private final IClasse classeService;

    public ClasseController(Mapper mapper, ClasseHelper classeHelper, IClasse classeService) {
        this.mapper = mapper;
        this.classeHelper = classeHelper;
        this.classeService = classeService;
    }

    @GetMapping
    public Flux<ClasseCreateResponse> index() {
        return classeHelper.findAll();

    }

    @PostMapping
    public Mono<ClasseCreateResponse> save(@RequestBody ClasseCreateRequest classeCreateRequestMono) {
       return classeHelper.save(classeCreateRequestMono);
    }

    @GetMapping("/{id}")
    public Mono<ClasseCreateResponse> findById(@PathVariable long id) {
        return classeHelper.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<String>> remove(@PathVariable long id) {
        return classeHelper.remove(id);
    }

    @PutMapping("/{id}")
    public Mono<ClasseCreateResponse> update(@RequestBody ClasseCreateRequest classeCreateRequest, @PathVariable long id) {
        return classeHelper.update(classeCreateRequest, id);
    }
}