package com.bootcamp.coffeeshop.customer.infrastructure.adapter.out;

import com.bootcamp.coffeeshop.customer.infrastructure.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity,Long> {
}
