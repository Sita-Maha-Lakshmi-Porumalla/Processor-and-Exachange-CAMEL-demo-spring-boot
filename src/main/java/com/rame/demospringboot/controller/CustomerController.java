package com.rame.demospringboot.controller;


import com.rame.demospringboot.model.Customer;
import com.rame.demospringboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/all")
    public Iterable<Customer> getAllCustomer() {
        return repo.findAll();
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable Long id) {
        Customer updatedCustomer = null;
       Optional<Customer> customer = repo.findById(id);
       if(customer.isPresent()) {
           updatedCustomer = customer.get();
           updatedCustomer.setFirstName(updatedCustomer.getFirstName() + "_updated");
       }

       return repo.save(updatedCustomer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        repo.deleteById(id);
    }



}
