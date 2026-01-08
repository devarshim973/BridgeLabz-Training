package com.Day7.TourMateTravelItineraryPlanner;

class TourMateExecutionEngine {

    public static void main(String[] args) {

        TransportService transport = new TransportService(15000);
        HotelService hotel = new HotelService(30000);
        ActivityService activity = new ActivityService(10000);

        BaseTripPlan domesticTrip =
            new DomesticTripPlan(
                "Goa", 5, transport, hotel, activity);

        BaseTripPlan internationalTrip =
            new InternationalTripPlan(
                "Paris", 7, transport, hotel, activity);

        System.out.println("---- BOOKING TRIPS ----");
        domesticTrip.book();
        System.out.println();
        internationalTrip.book();

        System.out.println("\n---- CANCELLATION ----");
        internationalTrip.cancel();
    }
}
