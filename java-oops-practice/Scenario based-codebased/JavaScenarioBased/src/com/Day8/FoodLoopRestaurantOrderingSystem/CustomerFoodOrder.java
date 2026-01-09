package com.Day8.FoodLoopRestaurantOrderingSystem;

import java.util.ArrayList;
import java.util.List;

class CustomerFoodOrder implements OrderablePolicy {

    private List<BaseFoodItem> foodItems;
    private double totalAmount;
    private boolean orderPlaced;

    // Constructor for custom combo meals
    public CustomerFoodOrder(List<BaseFoodItem> foodItems) {
        this.foodItems = foodItems;
        this.totalAmount = 0;
        this.orderPlaced = false;
    }

    // Place order
    @Override
    public void placeOrder() {

        if (orderPlaced) {
            System.out.println("Order already placed.");
            return;
        }

        for (BaseFoodItem item : foodItems) {
            if (!item.isAvailable()) {
                System.out.println(item.getName() + " is out of stock.");
                return;
            }
            totalAmount += item.getPrice(); // operator usage
        }

        double discount = applyDiscount();
        totalAmount = totalAmount - discount;

        // Reduce stock after successful calculation
        for (BaseFoodItem item : foodItems) {
            item.reduceStock();
        }

        orderPlaced = true;
        System.out.println("Order placed successfully.");
        System.out.println("Final Bill Amount: ₹" + totalAmount);
    }

    // Cancel order
    @Override
    public void cancelOrder() {
        if (!orderPlaced) {
            System.out.println("No active order to cancel.");
        } else {
            orderPlaced = false;
            System.out.println("Order cancelled successfully.");
        }
    }

    // Polymorphic discount logic
    protected double applyDiscount() {
        if (totalAmount >= 1000) {
            return totalAmount * 0.20; // 20% discount
        } else if (totalAmount >= 500) {
            return totalAmount * 0.10; // 10% discount
        }
        return 0;
    }
}
