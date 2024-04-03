package com.example.demo.phonepe.model;
import java.util.List;


public class Wallet {
    Long id;
    public Long getId() {
        return id;
    }
    Long userId;

    public Long getUserId() {
        return userId;
    }

    Double balance;
    public Double getBalance() {
        return balance;
    }

    public Double fetchBalance() {
        return getBalance();
    }
    public void setBalance(Double newBal) {
        this.balance = newBal;
    }

    public Wallet(Long userId) {
        this.userId = userId;
        this.balance = 0.0;
    }

}