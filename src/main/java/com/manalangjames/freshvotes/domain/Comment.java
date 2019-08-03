package com.manalangjames.freshvotes.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Comment {

    @EmbeddedId
    private CommentId pk;

    @Column(length = 5000)
    private String text;

}
