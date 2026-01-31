package com.FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public interface Vehicle {

    // Common method all vehicles must implement
    void displaySpeed();

    // New feature for battery display (default method)
    default void displayBattery() {
        // Default: vehicles without battery just show N/A
        System.out.println("Battery: N/A");
    }
}
