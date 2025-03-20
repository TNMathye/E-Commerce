package com.e_commerce.E_Commerce.entity;
import java.time.LocalDateTime;

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
@Table(name = "reviews")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
    private User user;
    private Product product;
}
