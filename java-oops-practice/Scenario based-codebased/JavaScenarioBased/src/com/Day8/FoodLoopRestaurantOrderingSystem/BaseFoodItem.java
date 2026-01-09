package com.Day8.FoodLoopRestaurantOrderingSystem;

abstract class BaseFoodItem {

    private String name;
    private String category;
    private double price;
    private int stock;      // hidden stock level

    public BaseFoodItem(String name, String category,
                        double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }

    // Encapsulated stock check
    protected boolean isAvailable() {
        return stock > 0;
    }

    // Stock reduced internally only
    protected void reduceStock() {
        stock--;
    }
}
