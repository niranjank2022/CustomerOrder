package com.ecom.CustomerOrder.service;

import com.ecom.CustomerOrder.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
}
