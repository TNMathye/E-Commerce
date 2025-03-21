package com.e_commerce.E_Commerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import com.e_commerce.E_Commerce.enums.EnumManager.DiscountType;

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
@Table(name = "promotions")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code, name, description;
    private DiscountType discountType;
    private BigDecimal discountValue, minPurchaseAmount;
    private LocalDateTime startDate, endDate;
    private boolean isActive;
    private Integer usageLimit, usageCount;
    private Set<Category> categories;
    private Set<Product> products;
}
