package com.Day7.MediStorePharmacyInventorySalesSystem;

import java.time.LocalDate;

abstract class BaseMedicineProduct implements SellableItemPolicy {

    private String name;
    private double price;          // sensitive
    private int quantity;          // stock
    private LocalDate expiryDate;

    // Default quantity constructor (10 units)
    public BaseMedicineProduct(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Custom quantity constructor
    public BaseMedicineProduct(String name, double price,
                               LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated getters (NO setters for price & quantity)
    public String getName() {
        return name;
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    // Stock adjustment only internally
    protected void reduceStock(int soldQty) {
        quantity -= soldQty;
    }

    // 🔐 Sensitive pricing logic (PRIVATE)
    private double calculateFinalCost(int qty) {
        double total = price * qty;
        double discount = (qty >= 5) ? total * 0.10 : 0; // 10% bulk discount
        return total - discount;
    }

    // Common selling workflow
    public void sellMedicine(int qty) {

        if (checkExpiry()) {
            System.out.println(name + " is expired. Sale blocked.");
            return;
        }

        if (qty > quantity) {
            System.out.println("Insufficient stock for " + name);
            return;
        }

        double billAmount = calculateFinalCost(qty);
        reduceStock(qty);

        System.out.println(
            qty + " units of " + name + " sold. Bill Amount: ₹" + billAmount
        );
    }

    // Polymorphic method
    public abstract boolean checkExpiry();
}
