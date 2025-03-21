package com.e_commerce.E_Commerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.e_commerce.E_Commerce.enums.EnumManager.ProductType;

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
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name, description, sku;
    private BigDecimal price;
    private BigDecimal dicountPrice;
    private boolean isActive;
    private ProductType productType;
    private LocalDateTime createdAt, updatedAt;
    private Set<Category> categories;
    private List<ProductImage> images;
    private List<ProductVariant> variants;
    private List<Review> reviews;
    private Inventory inventory;
    private Set<WishList> wishlists;
}
