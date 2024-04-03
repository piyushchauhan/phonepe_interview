package com.example.demo;
import com.example.demo.phonepe.model.User;
import com.example.demo.phonepe.model.Wallet;
import com.example.demo.phonepe.service.UserService;
import com.example.demo.phonepe.service.WalletService;

public class PhonePe {
    UserService userService;
    WalletService walletService;

    void main() {
        User ramesh = userService.registerUser("Piyush");
        Wallet rameshWallet = walletService.getWallet(ramesh.getId());
        walletService.topUpWallet(rameshWallet, 100.0);
        System.out.println("Ramesh has "+ rameshWallet.getBalance());

        User suresh = userService.registerUser("Suresh");
        
        
    }
}