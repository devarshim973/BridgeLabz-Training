package com.encapsulationandpolymorphism.ECommercePlatform;

public class ClothingItem extends Product implements Taxable {

    public ClothingItem(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}
