package com.e_commerce.E_Commerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.*;

import com.e_commerce.E_Commerce.enums.EnumManager.UserRole;

@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UserRole role;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
