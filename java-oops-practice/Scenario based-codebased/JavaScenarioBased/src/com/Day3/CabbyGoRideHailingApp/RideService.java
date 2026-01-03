package com.Day3.CabbyGoRideHailingApp;

public class RideService implements IRideService {

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        double fare = vehicle.calculateFare(distance);
        System.out.println("Booking Ride:");
        driver.displayInfo();
        vehicle.displayInfo();
        System.out.println("Distance: " + distance + " km, Fare: " + fare);
        System.out.println("Ride started...\n");
    }

    @Override
    public void endRide(Driver driver, Vehicle vehicle) {
        System.out.println("Ride ended for Vehicle: " + vehicle.vehicleNumber + " with Driver: " + driver.getLocation());
    }
}
