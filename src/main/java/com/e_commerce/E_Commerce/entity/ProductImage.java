package com.e_commerce.E_Commerce.entity;

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
@Table(name = "product_images")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ProductImage {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String imageURL;
    private boolean isPrimary;
    private Product product;
}
