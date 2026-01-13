package com.Day3.ParcelTracker;

public class ParcelTrackerApplication {

    public static void main(String[] args) {

        ParcelDeliveryChain chain = new ParcelDeliveryChain();

        chain.addStage("Packed");
        chain.addStage("Shipped");
        chain.addStage("In Transit");
        chain.addStage("Delivered");

        // Add custom intermediate checkpoint
        chain.addCheckpointAfter("Shipped", "Customs Clearance");

        // Forward tracking
        chain.trackParcel();
    }
}
