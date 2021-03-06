package com.iamdeok.board.repository;

import com.iamdeok.board.dto.Article;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepositoryTest {

    @Autowired
    ArticleRepository articleRepository;

    @After
    public void deleteALl(){
        articleRepository.deleteAll();
    }

    @Test
    public void test(){
        //Insert
        articleRepository.save(Article.builder()
                .articleAuthor("Deoki")
                .articleContent("Test Content.")
                .articleSubject("Test Subject.")
                .articlePassword("passw0rd")
                .build());

        //Load list
        List<Article> ArticleList = articleRepository.findAll();

        //Result
        Article article = ArticleList.get(0);
        assertEquals(article.getArticleAuthor(), "Deoki");
        assertEquals(article.getArticleContent(), "Test Content.");
        assertEquals(article.getArticleSubject(), "Test Subject.");
        assertEquals(article.getArticlePassword(), "passw0rd");
    }
}