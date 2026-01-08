package com.Day7.TourMateTravelItineraryPlanner;

class HotelService {

    private double hotelCost; // hidden cost

    public HotelService(double hotelCost) {
        this.hotelCost = hotelCost;
    }

    public double getHotelCost() {
        return hotelCost;
    }
}
