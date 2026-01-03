package com.Day3.CabbyGoRideHailingApp;

public class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;
    private double fare; // Encapsulated

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.fare = 0.0;
    }

    // Calculate fare (to be overridden)
    public double calculateFare(double distance) {
        return fare;
    }

    // Getter and Setter for fare
    public double getFare() {
        return fare;
    }

    protected void setFare(double fare) {
        this.fare = fare;
    }

    // Display vehicle info
    public void displayInfo() {
        System.out.println("Vehicle: " + vehicleNumber + ", Type: " + type + ", Capacity: " + capacity);
    }
}
