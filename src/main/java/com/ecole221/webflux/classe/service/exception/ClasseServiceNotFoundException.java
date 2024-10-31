package com.ecole221.webflux.classe.service.exception;

public class ClasseServiceNotFoundException extends RuntimeException{
    public ClasseServiceNotFoundException(String message) {
        super(message);
    }
}
