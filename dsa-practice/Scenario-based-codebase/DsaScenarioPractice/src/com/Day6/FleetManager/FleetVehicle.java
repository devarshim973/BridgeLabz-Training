package com.Day6.FleetManager;

public class FleetVehicle {

    private String vehicleId;
    private String depotName;
    private int mileage; // mileage in km

    public FleetVehicle(String vehicleId, String depotName, int mileage) {
        this.vehicleId = vehicleId;
        this.depotName = depotName;
        this.mileage = mileage;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDepotName() {
        return depotName;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " (" + depotName + ") - Mileage: " + mileage;
    }
}
