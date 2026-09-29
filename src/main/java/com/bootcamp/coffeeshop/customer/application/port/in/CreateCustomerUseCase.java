package com.bootcamp.coffeeshop.customer.application.port.in;

import com.bootcamp.coffeeshop.customer.domain.model.Customer;

public interface CreateCustomerUseCase {
    Customer create(CreateCustomerCommand cmd);
}
