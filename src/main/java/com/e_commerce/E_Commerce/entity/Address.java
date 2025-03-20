package com.e_commerce.E_Commerce.entity;
import com.e_commerce.E_Commerce.enums.EnumManager.AddressType;

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
@Table(name = "addresses")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private boolean isDefault =  false;
    private AddressType addressType;
    private User user;
}
