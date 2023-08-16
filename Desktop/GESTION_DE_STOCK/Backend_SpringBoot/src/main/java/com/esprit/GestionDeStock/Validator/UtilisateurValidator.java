package com.esprit.GestionDeStock.Validator;

import com.esprit.GestionDeStock.DTOs.CategoryDto;
import com.esprit.GestionDeStock.DTOs.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class UtilisateurValidator {

    public static List<String> validator(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if(utilisateurDto == null) {
            errors.add("Veuiliez renseigner le nom de l'utilisateur ");
            errors.add("Veuiliez renseigner le prenom de l'utilisateur ");
            errors.add("Veuiliez renseigner la date de naissance de l'utilisateur ");
            errors.add("Veuiliez renseigner le mot de passe de l'utilisateur ");
            errors.add("Veuiliez renseigner l'addresse de l'utilisateur ");

        }

        if (!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuiliez renseigner le nom de l'utilisateur ");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuiliez renseigner le prenom de l'utilisateur ");
        }
        if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("Veuiliez renseigner l'email de l'utilisateur ");
        }
        if (utilisateurDto.getDatedeNaissance() == null ) {
            errors.add("Veuiliez renseigner la date de naissance de l'utilisateur ");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuiliez renseigner le mot de passe de l'utilisateur ");
        }
        if (utilisateurDto.getAdresse()== null) {
            errors.add("Veuiliez renseigner l'addresse de l'utilisateur ");
        } else {
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())) {
                errors.add("le champ de code postale est obligatoire ");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                errors.add("le champ de la ville est obligatoire ");
            }
        }


        return errors;
    }
}
