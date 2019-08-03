package com.manalangjames.freshvotes.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Vote {

    @EmbeddedId
    private VoteId pk;
    private Boolean upvote;

}
