package com.freshvotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Emma_Lyy
 * @create 2022-03-17 23:52
 */

@Entity
@Embeddable
public class Vote {

    private VoteId pk;
    private Boolean upvote;

    @EmbeddedId
    public VoteId getPk() {
        return pk;
    }

    public void setPk(VoteId pk) {
        this.pk = pk;
    }


    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }
}
