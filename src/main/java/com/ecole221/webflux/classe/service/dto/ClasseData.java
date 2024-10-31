package com.ecole221.webflux.classe.service.dto;

public record ClasseData(String code, String libelleclasse, int fraisInscription,
                         int autresFrais, int mensualite, String libellefiliere) {
}
