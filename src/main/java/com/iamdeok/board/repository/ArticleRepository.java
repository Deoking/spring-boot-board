package com.iamdeok.board.repository;

import com.iamdeok.board.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author deoki
 * JPA Repository for Article.
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
