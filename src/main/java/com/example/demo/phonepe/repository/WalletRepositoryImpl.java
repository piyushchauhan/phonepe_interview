package com.example.demo.phonepe.repository;

import java.util.Map;
import com.example.demo.phonepe.model.Wallet;

public class WalletRepositoryImpl implements WalletRepository {
    Map<Long, Wallet> wallets;
    
    @Override
    public Wallet createWallet(Wallet wallet) {
        wallets.put(wallet.getUserId(),wallet);
        return wallet;
    }

    @Override
    public Wallet getWallet(Long userId) {
        if(wallets.containsKey(userId)) {
            return wallets.get(userId);
        }
        // Not Found Exception
        throw new RuntimeException("Wallet not found for userId:" + userId);
    }
    
    @Override
    public Wallet save(Wallet wallet) {
        wallets.put(wallet.getUserId(), wallet);
        return wallet;
    }
}
