package com.Day1.TravelLog;


import java.util.*;

public class TravelLogApplication {

    public static void main(String[] args) throws Exception {

        List<TravelTrip> trips = new ArrayList<>();

        trips.add(new TravelTrip("Paris", "France", 7,
                "Visited Paris and Rome during Europe trip"));
        trips.add(new TravelTrip("Rome", "Italy", 4,
                "Rome was amazing with Paris vibes"));
        trips.add(new TravelTrip("Paris", "France", 6,
                "Second visit to Paris"));
        trips.add(new TravelTrip("Tokyo", "Japan", 10,
                "Tokyo and Kyoto exploration"));

        // Serialize
        TravelLogFileHandler.writeTrips("travelTrips.dat", trips);

        // Deserialize
        List<TravelTrip> storedTrips =
                TravelLogFileHandler.readTrips("travelTrips.dat");

        System.out.println("🔍 Cities found using Regex:");
        System.out.println(TravelLogAnalyzer.findCitiesUsingRegex(storedTrips));

        System.out.println("\n⏳ Trips longer than 5 days:");
        TravelLogAnalyzer.tripsLongerThanFiveDays(storedTrips)
                .forEach(System.out::println);

        System.out.println("\n🌍 Unique countries visited:");
        System.out.println(TravelLogAnalyzer.getUniqueCountries(storedTrips));

        System.out.println("\n🏆 Top 3 most visited cities:");
        TravelLogAnalyzer.topThreeCities(storedTrips)
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
