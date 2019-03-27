package com.iamdeok.boad.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author deoki
 * The entity that maps to the "articles" table in the database.
 */
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private long articleId;

    @Column(name = "article_password")
    private String articlePassword;

    @Column(name = "article_subject")
    private String articleSubject;

    @Column(name = "article_conetent")
    private String articleContent;

    @Column(name = "article_author")
    private String articleAuthor;

    @Column(name = "article_date")
    private Date articleDate;

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getArticlePassword() {
        return articlePassword;
    }

    public void setArticlePassword(String articlePassword) {
        this.articlePassword = articlePassword;
    }

    public String getArticleSubject() {
        return articleSubject;
    }

    public void setArticleSubject(String articleSubject) {
        this.articleSubject = articleSubject;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }
}
