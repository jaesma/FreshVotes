package com.manalangjames.freshvotes.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CommentId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Feature feature;
}
