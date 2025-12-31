package com.Inheritance;

public class TwoWheeler extends Transport {
    boolean hasCarrier;

    public TwoWheeler(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle, Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}