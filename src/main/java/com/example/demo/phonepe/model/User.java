package com.example.demo.phonepe.model;


public class User {

    
    private Long id;
    public long getId() {
        return id;
    }
    
    String name;
    public String getName() {
        return name;
    }
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}