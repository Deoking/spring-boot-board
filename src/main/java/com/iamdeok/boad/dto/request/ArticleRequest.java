package com.iamdeok.boad.dto.request;

import com.iamdeok.boad.dto.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author deoki
 * The DTO class to be used in the view area.
 * the Entity class associated with the database,
 * should never be mapped directly to the Request Body.
 */
@Getter
@Setter
@NoArgsConstructor
public class ArticleRequest {

    private String articlePassword;
    private String articleSubject;
    private String articleContent;
    private String articleAuthor;

    public Article toEntity(){
        return Article.builder()
                .articleAuthor(articleAuthor)
                .articleContent(articleContent)
                .articlePassword(articlePassword)
                .articleSubject(articleSubject)
                .build();
    }
}
