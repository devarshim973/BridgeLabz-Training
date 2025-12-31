package com.Inheritance.multilevel;

public class RetailOrder {
    int orderId;
    String orderDate;

    public RetailOrder(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }

    void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}