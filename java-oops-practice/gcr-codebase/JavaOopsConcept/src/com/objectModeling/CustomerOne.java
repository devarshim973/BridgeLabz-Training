package com.objectModeling;

class CustomerOne {
    String customerName;

    CustomerOne(String customerName) {
        this.customerName = customerName;
    }

    void placeOrder(Order order) {
        System.out.println("\nCustomer: " + customerName + " placed an order");
        order.showOrderDetails();
    }
}