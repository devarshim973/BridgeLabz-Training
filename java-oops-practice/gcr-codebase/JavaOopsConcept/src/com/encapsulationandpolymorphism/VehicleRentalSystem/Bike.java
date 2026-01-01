package com.encapsulationandpolymorphism.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate,
                String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // cheaper rental
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (5%)";
    }
}

