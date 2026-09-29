package com.bootcamp.coffeeshop.customer.infrastructure.adapter.out;

import com.bootcamp.coffeeshop.customer.domain.model.Customer;
import com.bootcamp.coffeeshop.customer.infrastructure.entities.CustomerEntity;

public class CustomerPersistenceMapper {

    public static CustomerEntity toCustomerEntity(Customer customer) {
        CustomerEntity entity = new CustomerEntity(customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getPhone());
        entity.setId(customer.getId());
        return entity;
    }

    public static Customer toCustomer(CustomerEntity entity) {
        return new Customer(entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getCreatedAt(),
                entity.getUpdatedAt());
    }

}