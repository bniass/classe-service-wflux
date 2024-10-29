package com.ecole221.webflux.classe.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Classe {
    @Id
    private long id;
    private String code;
    private String libelle;
    private int fraisInscription;
    private int mensualite;
    private int autresFrais;
    private long filiereId;
}
