package com.encapsulationandpolymorphism.RideHailingApplication;

public abstract class RideVehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    protected RideVehicle(String vehicleId,
                          String driverName,
                          double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: controlled access
    protected double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println(
                "Vehicle ID: " + vehicleId +
                ", Driver: " + driverName +
                ", Rate/Km: ₹" + ratePerKm
        );
    }
}
