package com.encapsulationandpolymorphism.RideHailingApplication;

public class RideBike extends RideVehicle implements GPS {

    private String currentLocation;

    public RideBike(String vehicleId,
                    String driverName,
                    double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) * 0.9; // cheaper
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
