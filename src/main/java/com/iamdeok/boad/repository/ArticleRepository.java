package com.iamdeok.boad.repository;

import com.iamdeok.boad.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author deoki
 * JPA Repository for Article.
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
