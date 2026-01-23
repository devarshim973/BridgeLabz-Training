package com.Day10.OnlineTicketBooking;

public class TicketBookingApp {

    public static void main(String[] args) {

        EventBST bookingSystem = new EventBST();

        // Insert events
        bookingSystem.insertEvent(1800, "Music Concert");
        bookingSystem.insertEvent(1400, "Tech Talk");
        bookingSystem.insertEvent(2000, "Stand-up Comedy");
        bookingSystem.insertEvent(1600, "Startup Meetup");

        // Show events
        bookingSystem.showUpcomingEvents();

        // Cancel an event
        System.out.println("\n❌ Event cancelled at 1600\n");
        bookingSystem.cancelEvent(1600);

        // Show updated list
        bookingSystem.showUpcomingEvents();
    }
}
