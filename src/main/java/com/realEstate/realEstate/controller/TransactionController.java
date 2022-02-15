package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Transaction;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/{id}")
    public Response save(@RequestBody Transaction transaction,@PathVariable int id){
        return transactionService.save(transaction,id);
    }
    @GetMapping
    public List<Transaction> getAll(){return transactionService.getAll();}
}
