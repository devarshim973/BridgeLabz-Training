package com.encapsulationandpolymorphism.RideHailingApplication;

public class RideCar extends RideVehicle implements GPS {

    private String currentLocation;

    public RideCar(String vehicleId,
                   String driverName,
                   double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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
