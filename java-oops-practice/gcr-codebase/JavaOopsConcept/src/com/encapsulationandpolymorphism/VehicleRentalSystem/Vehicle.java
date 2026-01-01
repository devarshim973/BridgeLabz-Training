package com.encapsulationandpolymorphism.VehicleRentalSystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Sensitive detail (encapsulation)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type,
                   double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getters (no direct field access)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Setter for controlled update
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Insurance policy is protected via method, not field
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}
