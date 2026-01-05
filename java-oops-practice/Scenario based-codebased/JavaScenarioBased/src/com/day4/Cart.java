package com.day4;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<CartItem> items = new ArrayList<>();
    private double totalPrice;

    // Empty cart constructor
    public Cart() {
    }

    // Pre-filled cart constructor
    public Cart(List<CartItem> items) {
        this.items = items;
        calculateTotal();
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (CartItem item : items) {
            totalPrice += item.calculateItemTotal();
        }
    }

    @Override
    public double applyDiscount() {
        double discount = 0;
        for (CartItem item : items) {
            discount += item.calculateDiscount();
        }
        return discount;
    }

    @Override
    public double generateBill() {
        double discount = applyDiscount();
        return totalPrice - discount; // operator used
    }

    public void printSummary() {
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + applyDiscount());
        System.out.println("Final Payable: ₹" + generateBill());
    }
}
