package com.Day3.CabbyGoRideHailingApp;

public class Sedan extends Vehicle {
    private double ratePerKm = 15.0;
    private double baseFare = 75.0;

    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan");
    }

    @Override
    public double calculateFare(double distance) {
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}
