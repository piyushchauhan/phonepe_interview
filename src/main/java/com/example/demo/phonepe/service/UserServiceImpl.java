package com.example.demo.phonepe.service;

import com.example.demo.phonepe.model.Transaction;
import com.example.demo.phonepe.model.User;
import com.example.demo.phonepe.model.Wallet;
import com.example.demo.phonepe.repository.TransactionRepository;
import com.example.demo.phonepe.repository.UserRepository;
import com.example.demo.phonepe.repository.WalletRepository;

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    TransactionRepository transactionRepository;

    WalletRepository walletRepository;

    @Override
    public User registerUser(String name) {
        // Create user
        User u = new User(name);
        u = userRepository.createUser(u);

        // create wallet
        Wallet w = new Wallet(u.getId());
        w = walletRepository.save(w);
        return u;
    }

    @Override
    public Wallet getWallet(Long userId) {
        return walletRepository.getWallet(userId);
    }

    @Override
    public boolean sendMoney(User fromUser,User toUser, Double amount) {
        Wallet fromWallet = walletRepository.getWallet(fromUser.getId());
        Wallet toWallet = walletRepository.getWallet(toUser.getId());
        Transaction t = new Transaction(fromWallet.getId(), toWallet.getId(),amount);
        // debit from wallet and credit to wallet
    }
}