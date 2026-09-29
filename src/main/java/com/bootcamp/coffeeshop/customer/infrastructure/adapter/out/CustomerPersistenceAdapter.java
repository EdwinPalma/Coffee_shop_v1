package com.bootcamp.coffeeshop.customer.infrastructure.adapter.out;

import com.bootcamp.coffeeshop.customer.application.port.out.CustomerRepositoryPort;
import com.bootcamp.coffeeshop.customer.domain.model.Customer;
import com.bootcamp.coffeeshop.customer.infrastructure.entities.CustomerEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerPersistenceAdapter implements CustomerRepositoryPort {

    private final CustomerJpaRepository customerJpaRepository;

    public CustomerPersistenceAdapter(CustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity entitySaved = customerJpaRepository.save(CustomerPersistenceMapper.toCustomerEntity(customer));
        return CustomerPersistenceMapper.toCustomer(entitySaved);
    }

    @Override
    public List<Customer> findAll() {
        return customerJpaRepository.findAll().stream()
                .map(CustomerPersistenceMapper::toCustomer)
                .toList();
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return this.customerJpaRepository.findById(Long.valueOf(id)).map(CustomerPersistenceMapper::toCustomer);
    }

    @Override
    public void delete(Integer id) {
        this.customerJpaRepository.deleteById(Long.valueOf(id));
    }
}
