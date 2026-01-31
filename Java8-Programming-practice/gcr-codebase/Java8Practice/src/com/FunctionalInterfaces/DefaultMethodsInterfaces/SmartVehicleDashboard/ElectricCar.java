package com.FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public class ElectricCar implements Vehicle {

    private int batteryPercentage;

    public ElectricCar(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Electric car speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: " + batteryPercentage + "%");
    }
}
