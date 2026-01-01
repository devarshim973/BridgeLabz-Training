package com.encapsulationandpolymorphism.RideHailingApplication;

public class RideAuto extends RideVehicle implements GPS {

    private String currentLocation;

    public RideAuto(String vehicleId,
                    String driverName,
                    double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
