package com.encapsulationandpolymorphism.ECommercePlatform;

public class GroceryItem extends Product {

    public GroceryItem(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
