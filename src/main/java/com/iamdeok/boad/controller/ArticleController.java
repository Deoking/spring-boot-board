package com.iamdeok.boad.controller;

import com.iamdeok.boad.dto.Article;
import com.iamdeok.boad.dto.request.ArticleRequest;
import com.iamdeok.boad.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author deoki
 * RestController related to the status of the Article.
 */
@AllArgsConstructor
@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    ArticleRepository articleRepository;

    //logger
    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    /**
     * @param articleRequestDto
     * @return
     * Article create processing API.
     */
    @PostMapping
    public Article addArticle(@RequestBody ArticleRequest articleRequestDto) {

        Article article = articleRequestDto.toEntity();
        logger.info("Post request : {}", article);

        return articleRepository.save(article);
    }

    /**
     * @return
     * Article list load API.
     */
    @GetMapping
    public Iterable<Article> getArticles() {
        logger.info("Get request for find all.");
        return articleRepository.findAll();
    }

    /**
     * @param articleId
     * @return
     * Article load API.
     */
    @GetMapping(value = "/{articleId}")
    public Article getArticle(@PathVariable Long articleId) {
        logger.info("Get request for find one.");
        //https://stackoverflow.com/questions/49316751/spring-data-jpa-findone-change-to-optional-how-to-use-this/49317013
        return articleRepository.findById(articleId).orElse(null);
    }

    /**
     * @param articleId
     * @return
     * Article update processing API.
     */
    @PutMapping(value = "/{articleId}")
    public Article updateArticle(@PathVariable Long articleId, @RequestBody ArticleRequest articleRequestDto) {
        logger.info("Put request for update.");

        Article article = articleRepository.findById(articleId).orElse(null);

        if(article != null){
            article.setArticleAuthor(articleRequestDto.getArticleAuthor());
            article.setArticleContent(articleRequestDto.getArticleContent());
            article.setArticlePassword(articleRequestDto.getArticlePassword());
            article.setArticleSubject(articleRequestDto.getArticleSubject());
        }

        return articleRepository.save(article);
    }

    /**
     * @param articleId
     * @return
     * Article remove processing API.
     */
    @DeleteMapping(value = "/{articleId}")
    public void removeArticle(@PathVariable Long articleId) {
        articleRepository.deleteById(articleId);
    }
}