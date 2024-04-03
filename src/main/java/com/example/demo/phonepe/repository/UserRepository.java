package com.example.demo.phonepe.repository;

import com.example.demo.phonepe.model.User;


public interface UserRepository {
    User createUser(User User);
    User getUser(Long userId);
}