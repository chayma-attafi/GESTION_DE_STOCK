package com.esprit.GestionDeStock.Controlers;

import com.esprit.GestionDeStock.Controlers.api.ArticleApi;
import com.esprit.GestionDeStock.DTOs.ArticleDto;
import com.esprit.GestionDeStock.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleControler implements ArticleApi {

    // field injection
    //@Autowired
    private ArticleService articleService ; // injecter par champ

    //Getter injection
    //@Autowired
    //public ArticleService getArticleService() { //injecter par variable
    //   return articleService;}

    //Constructor injection
    @Autowired //cree des  instance ,
    public ArticleControler(ArticleService articleService) // injecter tt les dependence declarer dans le constrocteur
    {
        this.articleService = articleService;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
        return articleService.save(dto);
    }

    @Override
    public ArticleDto findById(Integer id) {
        return articleService.findById(id);
    }

    @Override
    public ArticleDto findByCodeArticle(String CodeArticle) {
        return articleService.findByCodeArticle(CodeArticle);
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleService.findAll();
    }

    @Override
    public void delete(Integer id) {
        articleService.delete(id);
    }
}
