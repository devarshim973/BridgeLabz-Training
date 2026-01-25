package com.Day1.TravelLog;



import java.io.Serializable;

public class TravelTrip implements Serializable {

    private String city;
    private String country;
    private int durationDays;
    private String notes;

    public TravelTrip(String city, String country, int durationDays, String notes) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.notes = notes;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + durationDays + " days)";
    }
}
