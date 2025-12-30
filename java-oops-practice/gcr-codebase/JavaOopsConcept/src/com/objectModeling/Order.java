package com.objectModeling;

class Order {
    int orderId;
    Product[] products;

    Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            if (p != null) {
                p.showProduct();
            }
        }
    }
}