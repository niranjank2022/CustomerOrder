package com.ecom.CustomerOrder.service;

import com.ecom.CustomerOrder.exception.ResourceNotFoundException;
import com.ecom.CustomerOrder.model.Customer;
import com.ecom.CustomerOrder.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer addCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found!"));
    }

    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }
}
