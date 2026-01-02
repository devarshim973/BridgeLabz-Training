package com.Day2.VehicleRentalApplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(int vehicleId, String brand, double baseRatePerDay) {
        super(vehicleId, brand, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return baseRatePerDay * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + baseRatePerDay);
    }
}

