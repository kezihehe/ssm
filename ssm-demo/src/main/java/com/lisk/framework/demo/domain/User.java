package com.lisk.framework.demo.domain;

import java.io.Serializable;

/**
 * Created by zuoch on 2017/5/28.
 */
public class User implements Serializable {

    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return this.getId()+"-->"+this.username;
    }
}
