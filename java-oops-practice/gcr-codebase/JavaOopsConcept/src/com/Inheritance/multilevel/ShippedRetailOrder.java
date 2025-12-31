package com.Inheritance.multilevel;

public class ShippedRetailOrder extends RetailOrder {
    String trackingNumber;

    public ShippedRetailOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped (Tracking #: " + trackingNumber + ")";
    }

    @Override
    void displayOrderInfo() {
        super.displayOrderInfo();
    }
}
