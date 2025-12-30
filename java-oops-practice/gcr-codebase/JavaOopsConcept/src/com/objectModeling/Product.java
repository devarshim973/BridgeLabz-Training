package com.objectModeling;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void showProduct() {
        System.out.println(productName + " - ₹" + price);
    }
}