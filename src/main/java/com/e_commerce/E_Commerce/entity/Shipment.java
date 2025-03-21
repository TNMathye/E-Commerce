package com.e_commerce.E_Commerce.entity;

import java.time.LocalDateTime;

import com.e_commerce.E_Commerce.enums.EnumManager.ShipmentStatus;

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
@Table(name = "shipments")
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trackingNumber, carrier;
    private LocalDateTime shipmentDate, deliveryDate;
    private ShipmentStatus shipmentStatus;
    private Order order;
}
