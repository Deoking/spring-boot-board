package com.iamdeok.boad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author deoki
 * The entity that maps to the "comments" table in the database.
 */
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @Column(name = "comment_id")
    private long commentId;

    @Column(name = "comment_password")
    private String commentPassword;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "comment_author")
    private String commentAuthor;

    @Column(name = "comment_date")
    private Date commentDate;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getCommentPassword() {
        return commentPassword;
    }

    public void setCommentPassword(String commentPassword) {
        this.commentPassword = commentPassword;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentData) {
        this.commentDate = commentData;
    }
}
