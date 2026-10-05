package com.bootcamp.coffeeshop.customer.application.service;

import com.bootcamp.coffeeshop.customer.application.port.in.*;
import com.bootcamp.coffeeshop.customer.application.port.out.CustomerRepositoryPort;
import com.bootcamp.coffeeshop.customer.domain.exception.CustomerNotFoundException;
import com.bootcamp.coffeeshop.customer.domain.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CreateCustomerUseCase, GetCustomerUseCase, UpdateFieldsCustomerUseCase, DeleteCustomerUseCase {
    CustomerRepositoryPort repository;

    public CustomerService(CustomerRepositoryPort repository){
        this.repository=repository;
    }

    @Override
    public Customer create(CreateCustomerCommand cmd) {
        Customer cus = new Customer();
        cus.setFirstName(cmd.getFirstName());
        cus.setLastName(cmd.getLastName());
        cus.setEmail(cmd.getEmail());

        return this.repository.save(cus);
    }

    @Override
    public Customer findById(Integer id) {
        Optional<Customer> optionalCustomer = this.repository.findById(id);
        if(optionalCustomer.isEmpty())
            throw new CustomerNotFoundException("Cliente no encontrado con id " + id);
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> findAll() {
        return this.repository.findAll();
    }


    @Override
    public void delete(Integer id) {

        Optional<Customer> optionalCustomer = this.repository.findById(id);
        if(optionalCustomer.isEmpty())
                throw new CustomerNotFoundException("Cliente no encontrado con id " + id);
        repository.deleteById(id); //falta agregar validacion de exception
    }

    @Override
    public Customer update(CreateCustomerCommand cmd) {
                return new Customer();
    }


}
