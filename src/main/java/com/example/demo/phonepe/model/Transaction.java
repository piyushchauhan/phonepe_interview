package com.example.demo.phonepe.model;
import java.time.ZonedDateTime;


public class Transaction {

    public  Transaction (Long fromWalletId, Long toWalletId,Double amount) {
        this.fromWalletId = fromWalletId;
        this.toWalletId = toWalletId;
        this.amount= amount;
    }
    Double amount;
    public Double getAmount() {
        return amount;
    }
    
    Long fromWalletId;
    public Long getFrom() {
        return fromWalletId;
    }
    Long toWalletId;
    public Long getTo() {
        return toWalletId;
    }
    
    ZonedDateTime createdAt;
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}