package com.github.perscholas;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String userPass;

    public Account(String name, String pass){
        setName(name);
        setPass(pass);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPass() {
        return userPass;
    }

    public void setPass(String pass) {
        this.userPass = pass;
    }
}
