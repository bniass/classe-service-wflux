package com.ecole221.webflux.classe.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FiliereCreateResponse {
    private long id;
    private String code;
    private String libelle;
}