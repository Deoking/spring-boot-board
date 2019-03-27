package com.iamdeok.boad.model;

import java.util.Date;

public class Comment {
    private long commentId;
    private String commentPassword;
    private String commentContent;
    private String commentAuthor;
    private Date commentData;

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

    public Date getCommentData() {
        return commentData;
    }

    public void setCommentData(Date commentData) {
        this.commentData = commentData;
    }
}
