package com.Collectors.OrderRevenueSummary;

class Order {
    private String orderId;
    private String customerName;
    private double orderTotal;

    public Order(String orderId, String customerName, double orderTotal) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}
