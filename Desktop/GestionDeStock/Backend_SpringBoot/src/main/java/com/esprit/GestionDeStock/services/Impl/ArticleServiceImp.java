package com.esprit.GestionDeStock.services.Impl;

import com.esprit.GestionDeStock.DTOs.ArticleDto;
import com.esprit.GestionDeStock.Entites.Article;
import com.esprit.GestionDeStock.Validator.ArticleValidator;
import com.esprit.GestionDeStock.exception.EntityNotFoundException;
import com.esprit.GestionDeStock.exception.ErrorCode;
import com.esprit.GestionDeStock.exception.InvalidEntityException;
import com.esprit.GestionDeStock.repository.ArticleRepository;
import com.esprit.GestionDeStock.services.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service // i can add annotation if i want extend my methods
@Slf4j
@Transactional
public class ArticleServiceImp implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImp (ArticleRepository articleRepository) {

        this.articleRepository =articleRepository;
    }
    @Override
    public ArticleDto save(ArticleDto dto) {
        List<String> errors = ArticleValidator.validator(dto);
        if (!errors.isEmpty()) {
            log.error("Article is not valid {}",dto);
            throw new InvalidEntityException("L'article n'est pas valide ",ErrorCode.ARTICLE_NOT_FOUND, errors);
        }
        Article saveArticle = articleRepository.save(ArticleDto.toEntity(dto)) ;
        return ArticleDto.fromEntity(saveArticle);
    }

    @Override
    public ArticleDto findById(Integer id) {
        if(id == null) {
            log.error("Article ID is null");
            return null;
        }
        Optional<Article> article = articleRepository.findById(id);
        ArticleDto dto = ArticleDto.fromEntity(article.get());
        return Optional.of(dto).orElseThrow(()->
                new EntityNotFoundException("aucun article avec l' id :"+id+"n etait trouvee dans la base de donne",ErrorCode.ARTICLE_NOT_FOUND));
    }

    @Override
    public ArticleDto findByCodeArticle(String CodeArticle) {
        if(!StringUtils.hasLength(CodeArticle)) {
            log.error("Article Code is null");
            return null;
        }
        Optional<Article> article = articleRepository.findArticleByCodeArticle(CodeArticle);
        ArticleDto dto = ArticleDto.fromEntity(article.get());
        return Optional.of(dto).orElseThrow(()->
                new EntityNotFoundException("aucun article avec l' id :"+CodeArticle+"n etait trouvee dans la base de donne",ErrorCode.ARTICLE_NOT_FOUND));
    }

    @Override
    public List<ArticleDto> findAll() {

        return articleRepository.findAll().stream()
                .map(ArticleDto::fromEntity) // :: appell methode reference
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null) {
            log.error("Article ID is null");
            return ;
        }
        articleRepository.deleteById(id);
    }
}
