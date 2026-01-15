package com.day4.EventManager;

public class EventTicket {

    private String eventName;
    private double price;

    public EventTicket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayTicket() {
        System.out.println(
            "Event: " + eventName +
            ", Price: ₹" + price
        );
    }
}
