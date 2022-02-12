package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction,Integer> {
}
