package com.Day7.TourMateTravelItineraryPlanner;

abstract class BaseTripPlan implements BookableServicePolicy {

    private String destination;
    private int duration;           // days
    private double budget;           // total budget

    protected TransportService transport;
    protected HotelService hotel;
    protected ActivityService activity;

    // Constructor to generate complete trip package
    public BaseTripPlan(String destination,
                        int duration,
                        TransportService transport,
                        HotelService hotel,
                        ActivityService activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operators used to compute total budget
        this.budget = calculateTotalBudget();
    }

    // Encapsulated budget calculation
    private double calculateTotalBudget() {
        return transport.getTransportCost()
             + hotel.getHotelCost()
             + activity.getActivityCost();
    }

    public String getDestination() {
        return destination;
    }

    public double getBudget() {
        return budget;
    }

    public int getDuration() {
        return duration;
    }

    // Polymorphic booking
    public abstract void book();

    public void cancel() {
        System.out.println("Trip to " + destination + " has been cancelled.");
    }
}
