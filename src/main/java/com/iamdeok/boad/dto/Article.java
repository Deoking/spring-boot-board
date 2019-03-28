package com.iamdeok.boad.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author deoki
 * The entity that maps to the "articles" table in the database.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@ToString
@Getter
@Setter
@Table
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Setter(AccessLevel.NONE)
    private long articleId;

    @Column(length = 100, nullable = false)
    private String articlePassword;

    @Column(length = 200, nullable = false)
    private String articleSubject;

    @Column(length = 1000, nullable = false)
    private String articleContent;

    @Column(length = 100, nullable = false)
    private String articleAuthor;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleDate;

    @Builder
    public Article(String articlePassword, String articleSubject, String articleContent, String articleAuthor){
        this.articlePassword = articlePassword;
        this.articleSubject = articleSubject;
        this.articleContent = articleContent;
        this.articleAuthor = articleAuthor;
    }
}
