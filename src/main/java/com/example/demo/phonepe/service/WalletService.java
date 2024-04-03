package com.example.demo.phonepe.service;

import com.example.demo.phonepe.model.Wallet;

public interface WalletService {
    Wallet getWallet(Long userId);
    boolean .topUpWallet(Wallet wallet, Double amount);
}