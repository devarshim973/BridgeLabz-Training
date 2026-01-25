package com.Day1.TravelLog;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TravelLogAnalyzer {

    // 🔍 Find cities using Regex
    public static Set<String> findCitiesUsingRegex(List<TravelTrip> trips) {
        Set<String> cities = new HashSet<>();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+\\b");

        for (TravelTrip trip : trips) {
            Matcher matcher = pattern.matcher(trip.getNotes());
            while (matcher.find()) {
                cities.add(matcher.group());
            }
        }
        return cities;
    }

    // ⏳ Trips longer than 5 days
    public static List<TravelTrip> tripsLongerThanFiveDays(List<TravelTrip> trips) {
        List<TravelTrip> result = new ArrayList<>();
        for (TravelTrip trip : trips) {
            if (trip.getDurationDays() > 5) {
                result.add(trip);
            }
        }
        return result;
    }

    // 🌍 Unique countries
    public static Set<String> getUniqueCountries(List<TravelTrip> trips) {
        Set<String> countries = new HashSet<>();
        for (TravelTrip trip : trips) {
            countries.add(trip.getCountry());
        }
        return countries;
    }

    // 🏆 Top 3 most visited cities
    public static List<Map.Entry<String, Integer>> topThreeCities(List<TravelTrip> trips) {

        Map<String, Integer> cityCountMap = new HashMap<>();

        for (TravelTrip trip : trips) {
            cityCountMap.put(
                trip.getCity(),
                cityCountMap.getOrDefault(trip.getCity(), 0) + 1
            );
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(cityCountMap.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        return list.subList(0, Math.min(3, list.size()));
    }
}
