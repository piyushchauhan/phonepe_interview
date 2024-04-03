package com.example.demo.phonepe.repository;

import com.example.demo.phonepe.model.Wallet;


public interface WalletRepository {
    Wallet createWallet(Wallet wallet);
    Wallet getWallet(Long userId);
    Wallet save(Wallet wallet);
}