package com.encapsulationandpolymorphism.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApplication {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(
                new Car("CAR-101", 3000, "POL-CAR-01")
        );
        vehicleList.add(
                new Bike("BIKE-202", 800, "POL-BIKE-02")
        );
        vehicleList.add(
                new Truck("TRUCK-303", 7000, "POL-TRUCK-03")
        );

        int rentalDays = 5;

        for (Vehicle vehicle : vehicleList) {

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost =
                        ((Insurable) vehicle).calculateInsurance();
            }

            System.out.println(
                    vehicle.getType() +
                    " | Rental Cost: " + rentalCost +
                    " | Insurance Cost: " + insuranceCost
            );
        }
    }
}
