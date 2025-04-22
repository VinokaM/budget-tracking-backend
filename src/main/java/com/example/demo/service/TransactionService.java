package com.example.demo.service;


import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction addTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public List<Transaction> getTransactionsByType(String type) {
        return repository.findByType(type);
    }

    public void deleteTransaction(String id) {
        repository.deleteById(id);
    }
}
