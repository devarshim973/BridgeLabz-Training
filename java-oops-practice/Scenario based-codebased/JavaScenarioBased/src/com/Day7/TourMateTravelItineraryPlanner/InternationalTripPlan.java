package com.Day7.TourMateTravelItineraryPlanner;

class InternationalTripPlan extends BaseTripPlan {

    public InternationalTripPlan(String destination,
                                 int duration,
                                 TransportService transport,
                                 HotelService hotel,
                                 ActivityService activity) {

        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International Trip Booked!");
        System.out.println("Destination: " + getDestination());
        System.out.println("Duration: " + getDuration() + " days");
        System.out.println("Total Budget: ₹" + getBudget());
        System.out.println("Passport & Visa verification required.");
    }
}
