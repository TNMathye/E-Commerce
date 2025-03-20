package com.e_commerce.E_Commerce.enums;

public class EnumManager {
    public enum AddressType {
        SHIPPING, BILLING, BOTH
    }

    public enum ProductType {
        PHYSICAL, DIGITAL
    }

    public enum DiscountType {
        PERCENTAGE, FIXED
    }

    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }

    public enum PaymentMethod {
        CREDIT_CARD, DEBIT_CARD, PAYPAL, BANK_TRANSFER, CASH_ON_DELIVERY
    }

    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED, REFUNDED
    }

    public enum ShipmentStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, RETURNED
    }

    public enum UserRole {
        USER, ADMIN
    }
}
