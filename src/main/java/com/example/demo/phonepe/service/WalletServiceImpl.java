package com.example.demo.phonepe.service;

import com.example.demo.phonepe.model.Wallet;
import com.example.demo.phonepe.repository.WalletRepository;

public class WalletServiceImpl implements WalletService {
    WalletRepository walletRepository;

    @Override
    public boolean topUpWallet(Wallet wallet, Double amount) {
        wallet.setBalance(wallet.getBalance() + amount);;
        walletRepository.save(wallet);
        return true;
    }

    @Override
    public Wallet getWallet(Long userId) {
        return walletRepository.getWallet(userId);
    }
}
