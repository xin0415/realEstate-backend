package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Offer;
import com.realEstate.realEstate.bean.Transaction;
import com.realEstate.realEstate.dao.OfferDao;
import com.realEstate.realEstate.dao.TransactionDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionDao transactionDao;
    @Autowired
    OfferDao offerDao;
    public Response save(Transaction transaction,int id){
        Offer f=offerDao.getById(id);
        transaction.setOffer(f);
        transactionDao.save(transaction);
        return new Response(true);
    }
    public List<Transaction> getAll(){
        return transactionDao.findAll();
    }
    public Response updateTransaction(Transaction transaction){
        Transaction tran=transactionDao.getById(transaction.getId());
        if(transaction.getStatus()!=null){
            tran.setStatus(transaction.getStatus());
        }
        if(transaction.getCompleteddate()!=null){
            tran.setCompleteddate(transaction.getCompleteddate());
        }
        transactionDao.save(tran);
        return new Response(true);
    }
}
