package com.ecom.CustomerOrder.repository;

import com.ecom.CustomerOrder.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
