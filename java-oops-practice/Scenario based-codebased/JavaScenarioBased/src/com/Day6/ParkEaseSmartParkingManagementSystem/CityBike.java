package com.Day6.ParkEaseSmartParkingManagementSystem;

class CityBike extends BaseVehicleUnit {

    public CityBike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 6;
        double penalty = hours > allowedHours ? 50 : 0;

        return (baseRate * hours) + penalty;
    }
}
