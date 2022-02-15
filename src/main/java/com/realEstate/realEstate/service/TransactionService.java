package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Transaction;
import com.realEstate.realEstate.dao.TransactionDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionDao transactionDao;
    public Response save(Transaction transaction){
        transactionDao.save(transaction);
        return new Response(true);
    }
    public List<Transaction> getAll(){
        return transactionDao.findAll();
    }
}
