package com.Day6.ParkEaseSmartParkingManagementSystem;

interface PaymentPolicy {

    // Calculates parking charges based on duration
    double calculateCharges(int hours);
}
