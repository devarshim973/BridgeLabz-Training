package com.Day3.CabbyGoRideHailingApp;

public class SUV extends Vehicle {
    private double ratePerKm = 20.0;
    private double baseFare = 100.0;

    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV");
    }

    @Override
    public double calculateFare(double distance) {
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}