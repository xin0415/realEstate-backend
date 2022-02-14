package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Customer;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Response save(@RequestBody Customer customer){return customerService.save(customer);}
    @GetMapping
    public List<Customer> getAll(){return customerService.getAll();}
    @PutMapping
    public void update(@RequestBody Customer customer){
        customerService.update(customer);
    }
}
