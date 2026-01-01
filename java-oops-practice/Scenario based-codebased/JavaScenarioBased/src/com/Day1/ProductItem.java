package com.Day1;

public class ProductItem {

    private String productName;
    private double price;
    private int quantity;

    public ProductItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
