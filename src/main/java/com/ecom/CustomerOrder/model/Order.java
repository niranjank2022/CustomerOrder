package com.ecom.CustomerOrder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference
    private com.ecom.CustomerOrder.model.Customer customer;
}
