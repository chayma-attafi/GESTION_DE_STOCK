package com.esprit.GestionDeStock.DTOs;


import com.esprit.GestionDeStock.Entites.Utilisateur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;



@Data
@Builder
public class UtilisateurDto {

    private String nom;

    private String prenom;

    private String email;

    private Instant datedeNaissance;

    private String MotDePasse;

    private AdresseDto adresse;

    private String photo;

    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }

        return UtilisateurDto.builder()

                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .datedeNaissance(utilisateur.getDateNaissance())
                .MotDePasse(utilisateur.getMotdepasse())

                .build();
    }

    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if(utilisateurDto == null){
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateur.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setDateNaissance(utilisateurDto.getDatedeNaissance());
        utilisateur.setMotdepasse(utilisateur.getMotdepasse());

        return utilisateur;
    }

}
