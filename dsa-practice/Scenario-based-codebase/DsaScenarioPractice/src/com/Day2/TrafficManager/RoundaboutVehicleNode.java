package com.Day2.TrafficManager;

class RoundaboutVehicleNode {

    String vehicleNumber;
    RoundaboutVehicleNode next;

    public RoundaboutVehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
