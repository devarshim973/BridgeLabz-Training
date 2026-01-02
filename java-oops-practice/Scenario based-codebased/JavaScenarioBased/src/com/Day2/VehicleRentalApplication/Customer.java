package com.Day2.VehicleRentalApplication;

public class Customer {
    private int customerId;
    private String customerName;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId +
                ", Name: " + customerName);
    }
}
