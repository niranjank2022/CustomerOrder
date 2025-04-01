package com.ecom.CustomerOrder.repository;

import com.ecom.CustomerOrder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
