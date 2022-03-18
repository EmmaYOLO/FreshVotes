package com.freshvotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author Emma_Lyy
 * @create 2022-03-18 1:17
 */


@Embeddable
public class CommentId implements Serializable {
    private static final long serialVersionUID = -3690211290276882371L;
    private User user;
    private Feature feature;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
