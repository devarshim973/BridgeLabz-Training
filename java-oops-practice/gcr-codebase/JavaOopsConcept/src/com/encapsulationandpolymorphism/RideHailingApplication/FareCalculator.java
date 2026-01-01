package com.encapsulationandpolymorphism.RideHailingApplication;

import java.util.List;

class FareCalculator {

    public static void calculateFares(
            List<RideVehicle> vehicles,
            double distance) {

        for (RideVehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            double fare = vehicle.calculateFare(distance);
            System.out.println(
                    "Distance: " + distance + " km"
            );
            System.out.println("Fare: ₹" + fare);

            System.out.println("-------------------------");
        }
    }
}
