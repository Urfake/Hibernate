package com.spring.classes.Model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Authority {
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String authority;
}
