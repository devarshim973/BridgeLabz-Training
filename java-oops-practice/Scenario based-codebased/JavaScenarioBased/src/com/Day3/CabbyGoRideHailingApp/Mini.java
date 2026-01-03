package com.Day3.CabbyGoRideHailingApp;

public class Mini extends Vehicle {
    private double ratePerKm = 10.0;
    private double baseFare = 50.0;

    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini");
    }

    @Override
    public double calculateFare(double distance) {
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}