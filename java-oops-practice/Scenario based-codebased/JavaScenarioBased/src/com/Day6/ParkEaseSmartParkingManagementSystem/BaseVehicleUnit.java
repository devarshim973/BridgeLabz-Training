package com.Day6.ParkEaseSmartParkingManagementSystem;

abstract class BaseVehicleUnit implements PaymentPolicy {

    protected String vehicleNumber;
    protected double baseRate;

    public BaseVehicleUnit(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }
}
