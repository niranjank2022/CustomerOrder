package com.ecom.CustomerOrder.service;

import com.ecom.CustomerOrder.exception.ResourceNotFoundException;
import com.ecom.CustomerOrder.model.Order;
import com.ecom.CustomerOrder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order) {
        return repository.save(order);
    }

    public Order getOrderById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found!"));
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
