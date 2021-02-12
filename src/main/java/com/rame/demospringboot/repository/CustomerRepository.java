package com.rame.demospringboot.repository;

import com.rame.demospringboot.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
