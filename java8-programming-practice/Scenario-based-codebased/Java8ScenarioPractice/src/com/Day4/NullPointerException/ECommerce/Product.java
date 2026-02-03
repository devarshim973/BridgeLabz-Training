package com.Day4.NullPointerException.ECommerce;

import java.util.Optional;

class Product {

    private int productId;
    private String name;
    private Double discount;           // may be null
    private String couponCode;          // may be null
    private String description;         // may be null
    private Seller seller;              // may be null
    private DeliveryPartner delivery;   // may be null

    public Product(int productId, String name, Double discount,
                   String couponCode, String description,
                   Seller seller, DeliveryPartner delivery) {

        this.productId = productId;
        this.name = name;
        this.discount = discount;
        this.couponCode = couponCode;
        this.description = description;
        this.seller = seller;
        this.delivery = delivery;
    }

    // 1. Discount with default
    public Optional<Double> getDiscount() {
        return Optional.ofNullable(discount);
    }

    // 2. Coupon code
    public Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }

    // 3. Seller details
    public Optional<Seller> getSeller() {
        return Optional.ofNullable(seller);
    }

    // 4. Product description
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    // 5. Delivery partner
    public Optional<DeliveryPartner> getDelivery() {
        return Optional.ofNullable(delivery);
    }
}
