package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Customer;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Response save(@RequestBody Customer customer){return customerService.save(customer);}
}
