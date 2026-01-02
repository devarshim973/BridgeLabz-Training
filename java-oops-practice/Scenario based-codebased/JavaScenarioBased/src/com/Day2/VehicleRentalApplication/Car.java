package com.Day2.VehicleRentalApplication;

public class Car extends Vehicle implements Rentable {
    private double luxuryCharge = 500;

    public Car(int vehicleId, String brand, double baseRatePerDay) {
        super(vehicleId, brand, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRatePerDay * days) + luxuryCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + baseRatePerDay +
                ", Luxury Charge: ₹" + luxuryCharge);
    }
}
