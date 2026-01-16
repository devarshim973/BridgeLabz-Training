package com.Day5.RoboWarehouse;

public class WarehousePackage {

    private int packageId;
    private double weight;

    public WarehousePackage(int packageId, double weight) {
        this.packageId = packageId;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getPackageId() {
        return packageId;
    }

    @Override
    public String toString() {
        return "PackageID: " + packageId + ", Weight: " + weight;
    }
}
