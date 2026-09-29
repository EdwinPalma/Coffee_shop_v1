package com.bootcamp.coffeeshop.customer.application.port.out;

import com.bootcamp.coffeeshop.customer.domain.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepositoryPort {
    Customer save(Customer customer);
    List<Customer> findAll();
    Optional<Customer> findById(Integer id);
    Customer delete(Integer id);
}

