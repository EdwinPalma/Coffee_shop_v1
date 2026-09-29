package com.bootcamp.coffeeshop.customer.application.port.in;

import com.bootcamp.coffeeshop.customer.domain.model.Customer;

import java.util.List;

public interface GetCustomerUseCase {
    Customer findById(Integer id);
    List<Customer> findAll();
}
