package com.esprit.GestionDeStock.repository;

import com.esprit.GestionDeStock.Entites.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Optional<Article> findArticleByCodeArticle (String codeArticle) ;

}
