package com.Day6.ParkEaseSmartParkingManagementSystem;

class SmartParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String bookingLog; // internal record

    public SmartParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
        this.bookingLog = "Slot Created";
    }

    // Controlled booking
    public boolean bookSlot(String vehicleType) {
        if (!isOccupied && vehicleTypeAllowed.equals(vehicleType)) {
            isOccupied = true;
            bookingLog = "Slot booked for " + vehicleType;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot released";
    }

    // Read-only exposure
    public String getBookingLog() {
        return bookingLog;
    }

    public boolean isSlotOccupied() {
        return isOccupied;
    }
}
