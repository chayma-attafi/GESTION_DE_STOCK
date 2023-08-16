package com.esprit.GestionDeStock.DTOs;

import com.esprit.GestionDeStock.Entites.Article;
import lombok.Data;
import lombok.Builder;


import java.math.BigDecimal;
@Data
@Builder
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHT;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategoryDto category;

    public static ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHT(article.getPrixUnitaireHT())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .build();
    }

    public static Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return null;
        }

        Article article = new Article();
        article.setId((articleDto.getId()));
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(article.getDesignation());
        article.setPrixUnitaireHT(article.getPrixUnitaireHT());
        article.setTauxTva(article.getTauxTva());
        article.setPrixUnitaireTtc(article.getPrixUnitaireTtc());

        return article;
    }
}
