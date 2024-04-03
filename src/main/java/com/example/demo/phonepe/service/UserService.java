package com.example.demo.phonepe.service;

import com.example.demo.phonepe.model.User;
import com.example.demo.phonepe.model.Wallet;


public interface UserService {
    // create user, wallet with zero balance
    User registerUser(String name);

    
    Wallet getWallet(Long userId);

    boolean sendMoney(User fromUser,User toUser, Double amount);
}