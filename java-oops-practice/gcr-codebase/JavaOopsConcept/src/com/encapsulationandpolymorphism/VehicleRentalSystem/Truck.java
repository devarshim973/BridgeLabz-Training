package com.encapsulationandpolymorphism.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate,
                 String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 2000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (15%)";
    }
}
