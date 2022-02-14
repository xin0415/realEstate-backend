package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Customer;
import com.realEstate.realEstate.dao.CustomerDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public Response save(Customer customer){
        customerDao.save(customer);
        return new Response(true);
    }
    public List<Customer> getAll(){return customerDao.findAll();}
}
