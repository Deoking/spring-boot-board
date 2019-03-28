package com.iamdeok.boad.repository;

import com.iamdeok.boad.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
