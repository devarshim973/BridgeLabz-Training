package com.Day7.TourMateTravelItineraryPlanner;

class TransportService {

    private double transportCost; // hidden cost

    public TransportService(double transportCost) {
        this.transportCost = transportCost;
    }

    // Encapsulated access
    public double getTransportCost() {
        return transportCost;
    }
}
