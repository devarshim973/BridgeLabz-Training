package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    protected FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: getters only
    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println(
                "Item: " + itemName +
                ", Price: ₹" + price +
                ", Quantity: " + quantity
        );
    }
}
