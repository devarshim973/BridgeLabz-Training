package com.Day6.ParkEaseSmartParkingManagementSystem;

class CityTruck extends BaseVehicleUnit {

    public CityTruck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 4;
        double penalty = hours > allowedHours ? 200 : 0;

        return (baseRate * hours) + penalty;
    }
}
