package com.iamdeok.board.service;

import com.iamdeok.board.dto.Article;
import com.iamdeok.board.dto.request.ArticleRequest;
import com.iamdeok.board.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author deoki
 * Article Business Logic Processing Service.
 */
@Service
@AllArgsConstructor
public class ArticleService {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);

    ArticleRepository articleRepository;

    /**
     * @param article
     * @return
     * Article create processing API.
     */
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    /**
     * @return
     * Article list load API.
     */
    public Iterable<Article> getArticles() {
        return articleRepository.findAll();
    }

    /**
     * @param articleId
     * @return
     * Article load API.
     */
    public Article getArticle(Long articleId) {
        //https://stackoverflow.com/questions/49316751/spring-data-jpa-findone-change-to-optional-how-to-use-this/49317013
        return articleRepository.findById(articleId).orElse(null);
    }

    /**
     * @param articleId, articleRequestDto
     * @return
     * Article update processing API.
     */
    public Article updateArticle(Long articleId, ArticleRequest articleRequestDto) {

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
    public void removeArticle(Long articleId) {
        articleRepository.deleteById(articleId);
    }
}
