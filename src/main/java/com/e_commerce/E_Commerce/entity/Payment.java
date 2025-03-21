package com.e_commerce.E_Commerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.e_commerce.E_Commerce.enums.EnumManager.PaymentMethod;
import com.e_commerce.E_Commerce.enums.EnumManager.PaymentStatus;

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
@Table(name = "payments")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private String transactionId;
    private LocalDateTime paymentDate;
    private BigDecimal amount;
    private Order order;
}
