package com.day4;

abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    protected Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Polymorphic discount method
    public abstract double getDiscountRate();

    public String getProductDetails() {
        return name + " (" + category + ") - ₹" + price;
    }
}
