package com.iamdeok.boad.controller;

import com.iamdeok.boad.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author deoki
 * RestController related to the status of the Article.
 */
@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    /**
     * @param model
     * @return
     * Article create processing API.
     */
    @PostMapping
    public Article addArticle(Model model) {

        logger.debug("POST request!");

        return null;
    }

    /**
     * @param model
     * @return
     * Article list load API.
     */
    @GetMapping
    public Iterable<Article> getArticles(Model model) {
        return null;
    }

    /**
     * @param model
     * @return
     * Article load API.
     */
    @GetMapping(value = "/{articleId}")
    public Article getArticle(Model model) {
        return null;
    }

    /**
     * @param model
     * @return
     * Article update processing API.
     */
    @PutMapping(value = "/{articleId}")
    public Article updateArticle(Model model) {
        return null;
    }

    /**
     * @param model
     * @return
     * Article remove processing API.
     */
    @DeleteMapping
    public Article removeArticle(Model model) {
        return null;
    }
}