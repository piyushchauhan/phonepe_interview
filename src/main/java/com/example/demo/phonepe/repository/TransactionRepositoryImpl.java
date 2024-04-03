package com.example.demo.phonepe.repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.demo.phonepe.model.Transaction;

public class TransactionRepositoryImpl implements TransactionRepository {
    List<Transaction> transactions;

    @Override
    public Transaction save(Transaction t) {
        transactions.add(t);
        return t;
    }

    @Override
    public List<Transaction> getAllUserTransactions(Long userId) {
        List<Transaction> userTransactions = transactions.stream()
                .filter(t -> t.getFrom().equals(userId) || t.getTo().equals(userId))
                .collect(Collectors.toList());
        return userTransactions;
    }

    @Override
    public List<Transaction> getAllUserTransactionsSorted(Long userId, String sortKey) {
        List<Transaction> userTransactions = getAllUserTransactions(userId);
        Collections.sort(userTransactions, (a,b) -> {
            if(sortKey.equals("date")) {
                return a.getCreatedAt().isBefore(b.getCreatedAt());
            } else if (sortKey.equals("balance")) {
                return a.getAmount().compareTo(b.getAmount());
            }
        });
        

    }
    
}
