package com.Inheritance.multilevel;

public class DeliveredRetailOrder extends ShippedRetailOrder {
    String deliveryDate;

    public DeliveredRetailOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    @Override
    void displayOrderInfo() {
        super.displayOrderInfo();
    }
}