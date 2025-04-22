package com.example.demo.controller;


import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return service.addTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }

    @GetMapping("/{type}")
    public List<Transaction> getByType(@PathVariable String type) {
        return service.getTransactionsByType(type);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable String id) {
        service.deleteTransaction(id);
    }
}
