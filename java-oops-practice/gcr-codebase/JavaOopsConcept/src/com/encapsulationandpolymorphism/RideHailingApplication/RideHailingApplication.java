package com.encapsulationandpolymorphism.RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {

    public static void main(String[] args) {

        List<RideVehicle> vehicles = new ArrayList<>();

        RideCar car = new RideCar(
                "CAR101", "Raj", 15
        );
        RideBike bike = new RideBike(
                "BIKE202", "Aman", 10
        );
        RideAuto auto = new RideAuto(
                "AUTO303", "Suresh", 12
        );

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        FareCalculator.calculateFares(
                vehicles, 10
        );
    }
}
