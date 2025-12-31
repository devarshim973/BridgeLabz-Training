package com.Inheritance;

public class TransportSystemDemo {
    public static void main(String[] args) {

        // Create different vehicle objects
        AutoCar car = new AutoCar(180, "Petrol", 5);
        CargoTruck truck = new CargoTruck(120, "Diesel", 10);
        TwoWheeler bike = new TwoWheeler(100, "Petrol", true);

        // Store in Transport array for polymorphism
        Transport[] vehicles = {car, truck, bike};

        System.out.println("Vehicle Information:\n");
        for (Transport v : vehicles) {
            v.displayInfo();
            System.out.println("--------------------------");
        }
    }
}