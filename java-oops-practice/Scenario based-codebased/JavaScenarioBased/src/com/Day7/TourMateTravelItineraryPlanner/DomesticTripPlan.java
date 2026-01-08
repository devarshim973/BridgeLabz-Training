package com.Day7.TourMateTravelItineraryPlanner;

class DomesticTripPlan extends BaseTripPlan {

    public DomesticTripPlan(String destination,
                             int duration,
                             TransportService transport,
                             HotelService hotel,
                             ActivityService activity) {

        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic Trip Booked!");
        System.out.println("Destination: " + getDestination());
        System.out.println("Duration: " + getDuration() + " days");
        System.out.println("Total Budget: ₹" + getBudget());
        System.out.println("ID Proof verification required.");
    }
}
