package com.example.demo.phonepe.repository;

import com.example.demo.phonepe.model.Transaction;
import java.util.List;


public interface TransactionRepository {
    Transaction save(Transaction t);
    List<Transaction> getAllUserTransactions(Long userId);
    List<Transaction> getAllUserTransactionsSorted(Long userId, String sortKey);
}