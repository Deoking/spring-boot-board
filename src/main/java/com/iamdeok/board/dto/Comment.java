package com.iamdeok.board.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author deoki
 * The entity that maps to the "comments" table in the database.
 */
@Entity
@Table
public class Comment {

    @Id
    @Column
    private long commentId;

    @Column
    private String commentPassword;

    @Column
    private String commentContent;

    @Column
    private String commentAuthor;
}
