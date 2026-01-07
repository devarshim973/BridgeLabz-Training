package com.Day6.ParkEaseSmartParkingManagementSystem;

class ParkEaseExecutionEngine {

    public static void main(String[] args) {

        BaseVehicleUnit vehicle = new CityCar("MH12AB1234");
        SmartParkingSlot slot =
                new SmartParkingSlot("A1", "Car");

        if (slot.bookSlot("Car")) {

            int parkingHours = 7;
            double charges = vehicle.calculateCharges(parkingHours);

            System.out.println("Parking Slot Booked");
            System.out.println("Total Charges: " + charges);

            slot.releaseSlot();
        }

        System.out.println("Slot Occupied: " + slot.isSlotOccupied());
        System.out.println("Booking Log: " + slot.getBookingLog());
    }
}
