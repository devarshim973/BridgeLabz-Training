package com.Day6.ParkEaseSmartParkingManagementSystem;

class CityCar extends BaseVehicleUnit {

    public CityCar(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 5;
        double penalty = hours > allowedHours ? 100 : 0;

        return (baseRate * hours) + penalty;
    }
}
