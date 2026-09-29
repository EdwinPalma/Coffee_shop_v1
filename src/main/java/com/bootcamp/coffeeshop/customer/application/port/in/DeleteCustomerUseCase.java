package com.bootcamp.coffeeshop.customer.application.port.in;

import com.bootcamp.coffeeshop.customer.domain.model.Customer;

public interface DeleteCustomerUseCase {
    Customer delete(Long id);

    Customer delete(Integer id);
}
