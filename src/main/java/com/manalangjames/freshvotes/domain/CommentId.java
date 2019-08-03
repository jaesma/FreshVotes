package com.manalangjames.freshvotes.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class CommentId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Feature feature;
}
