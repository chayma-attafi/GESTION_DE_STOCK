package com.esprit.GestionDeStock.DTOs;

import com.esprit.GestionDeStock.Entites.Adresse;
//import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {
    private String adresse;

    private String ville;

    private  String codePostale;

    //DTO : data transfer object
    //Adresse --> AdresseDTO
    public static AdresseDto fromEntity(Adresse adresse){
        if (adresse == null){
            return null;
        }

        return AdresseDto.builder()
                .adresse(adresse.getAdresse())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .build();
    }

    
    //AdresseDTO --> Adresse
    public static Adresse toEntity(AdresseDto adresseDto){
        if (adresseDto == null){
            return null;
        }

        Adresse adresse =new Adresse();
        adresse.setAdresse(adresseDto.getAdresse());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        return adresse;
    }

}
