package com.company.examples.module2.ex004_this;

public class User {

    private String username;
    private String password;
    private int age;

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User(String username, String password) {
        this(username, password, 18); // new User(username, password, 18)
    }
}
