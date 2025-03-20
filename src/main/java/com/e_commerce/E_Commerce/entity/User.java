package com.e_commerce.E_Commerce.entity;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String email;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected Set<Role> roles;
    protected List<Address> addresses;
    protected List<Order> Order;
    protected Cart cart;
    protected List<Review> reviews;
    protected WishList wishList;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
    protected boolean enabled = false;
}
