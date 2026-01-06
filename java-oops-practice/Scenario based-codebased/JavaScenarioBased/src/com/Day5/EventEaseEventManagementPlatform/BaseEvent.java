package com.Day5.EventEaseEventManagementPlatform;

public class BaseEvent implements EventSchedulable {

    private final int eventId; // cannot be changed once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // Encapsulated pricing
    private double venueCost;
    private double serviceCost;
    private double discount;

    public BaseEvent(int eventId, String eventName, String location,
                     String date, int attendees,
                     double venueCost, double serviceCost, double discount) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event cancelled.");
    }

    public void showEventDetails() {
        System.out.println("Event: " + eventName +
                ", Location: " + location +
                ", Date: " + date +
                ", Total Cost: ₹" + calculateTotalCost());
    }
}
