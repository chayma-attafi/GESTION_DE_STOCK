package com.esprit.GestionDeStock.services;

import com.esprit.GestionDeStock.DTOs.ArticleDto;

import java.util.List;

public interface ArticleService {

    ArticleDto save (ArticleDto dto);
    ArticleDto findById (Integer id);
    ArticleDto findByCodeArticle(String CodeArticle);
    List<ArticleDto> findAll();
    void delete (Integer id);
}
