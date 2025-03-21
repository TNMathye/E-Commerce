package com.e_commerce.E_Commerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.e_commerce.E_Commerce.enums.EnumManager.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private BigDecimal subTotal;
    private BigDecimal shippingCosts;
    private BigDecimal taxAmount;
    private BigDecimal totalAmoount;
    private User user;
    private Address shippingAddress;
    private Address billingAddress;
    private List<OrderItem> orderItems;
    private Payment payment;
    private Shipment shipment;
}
