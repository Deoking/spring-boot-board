package com.iamdeok.board.controller;

import com.iamdeok.board.dto.Article;
import com.iamdeok.board.dto.request.ArticleRequest;
import com.iamdeok.board.service.ArticleService;
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

    ArticleService articleService;

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
        return articleService.addArticle(article);
    }

    /**
     * @return
     * Article list load API.
     */
    @GetMapping
    public Iterable<Article> getArticles() {
        logger.info("Get request for find all.");
        return articleService.getArticles();
    }

    /**
     * @param articleId
     * @return
     * Article load API.
     */
    @GetMapping(value = "/{articleId}")
    public Article getArticle(@PathVariable Long articleId) {
        logger.info("Get request for find one.");
        return articleService.getArticle(articleId);
    }

    /**
     * @param articleId
     * @return
     * Article update processing API.
     */
    @PutMapping(value = "/{articleId}")
    public Article updateArticle(@PathVariable Long articleId, @RequestBody ArticleRequest articleRequestDto) {
        logger.info("Put request for update.");
        return articleService.updateArticle(articleId, articleRequestDto);
    }

    /**
     * @param articleId
     * @return
     * Article remove processing API.
     */
    @DeleteMapping(value = "/{articleId}")
    public void removeArticle(@PathVariable Long articleId) {
        logger.info("Delete request for delete.");
        articleService.removeArticle(articleId);
    }
}