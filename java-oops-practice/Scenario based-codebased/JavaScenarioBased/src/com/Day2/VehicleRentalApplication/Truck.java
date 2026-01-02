package com.Day2.VehicleRentalApplication;

public class Truck extends Vehicle implements Rentable {
    private double loadChargePerDay = 800;

    public Truck(int vehicleId, String brand, double baseRatePerDay) {
        super(vehicleId, brand, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRatePerDay + loadChargePerDay) * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + baseRatePerDay +
                ", Load Charge/Day: ₹" + loadChargePerDay);
    }
}
