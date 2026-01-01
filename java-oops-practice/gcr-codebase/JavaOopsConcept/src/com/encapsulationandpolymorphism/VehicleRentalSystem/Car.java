package com.encapsulationandpolymorphism.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate,
               String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (10%)";
    }
}
