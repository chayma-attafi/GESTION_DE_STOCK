package com.esprit.GestionDeStock.Controlers.api;

import com.esprit.GestionDeStock.DTOs.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static com.esprit.GestionDeStock.Utils.Constants.App_ROOT;
public interface ArticleApi {

    @PostMapping(value = App_ROOT +"/article/creat",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save (@RequestBody ArticleDto dto);

    @GetMapping(value = App_ROOT + "article/{idArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById (@PathVariable("idArticle") Integer id);

    @GetMapping(value = App_ROOT + "article/{CodeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findByCodeArticle(String CodeArticle);

    @GetMapping(value = App_ROOT + "article/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();

    @DeleteMapping(value = App_ROOT + "article/delete/{idArticle}")
    void delete (@PathVariable("idArticle") Integer id); //path id is idArticle
}
