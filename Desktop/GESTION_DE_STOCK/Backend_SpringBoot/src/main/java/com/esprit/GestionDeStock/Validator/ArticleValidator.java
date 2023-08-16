package com.esprit.GestionDeStock.Validator;

import com.esprit.GestionDeStock.DTOs.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validator(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();

        if (articleDto == null) {
            errors.add("Veuiliez renseigner le code de l'article");
            errors.add("Veuiliez renseigner la designation de l'article");
            errors.add("Veuiliez renseigner le prix unitaire hors taxe de l'article");
            errors.add("Veuiliez renseigner le prix unitaire toutes taxes comprises de l'article");
            errors.add("Veuiliez renseigner le Taux TVA  de l'article");
            errors.add("Veuiliez renseigner la category");
        }
        if (!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("Veuiliez renseigner le code de l'article");
        }
        if (!StringUtils.hasLength(articleDto.getDesignation())) {
            errors.add("Veuiliez renseigner la designation de l'article");
        }
        if (articleDto.getPrixUnitaireHT() == null ) {
            errors.add("Veuiliez renseigner le prix unitaire hors taxe de l'article");
        }
        if (articleDto.getPrixUnitaireTtc() == null) {
            errors.add("Veuiliez renseigner le prix unitaire toutes taxes comprises de l'article");
        }
        if (articleDto.getTauxTva() == null) {
            errors.add("Veuiliez renseigner le Taux TVA  de l'article");
        }
        if (articleDto.getCategory() == null) {
            errors.add("Veuiliez renseigner la category");
        }

        return errors;
    }
}
