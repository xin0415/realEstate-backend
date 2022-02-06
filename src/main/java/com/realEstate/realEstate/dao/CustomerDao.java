package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
