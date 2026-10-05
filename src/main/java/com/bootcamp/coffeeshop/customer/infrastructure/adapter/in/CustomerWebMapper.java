package com.bootcamp.coffeeshop.customer.infrastructure.adapter.in;

import com.bootcamp.coffeeshop.customer.application.port.in.CreateCustomerCommand;
import com.bootcamp.coffeeshop.customer.domain.model.Customer;

import java.util.List;

public class CustomerWebMapper {

    public static CustomerDto toCustomerDto(Customer customer) {
        return new CustomerDto(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getPhone()
        );
    }

    public static List<CustomerDto> toListOfCustomerDto(List<Customer> customerList) {
        return customerList.stream()
                .map(customer -> toCustomerDto(customer))
                .toList();
    }

    public static CreateCustomerCommand toCommand(CustomerDto request) {
        return new CreateCustomerCommand(request.getFirstName(), request.getLastName(), request.getEmail(), request.getPhone());
    }
}
