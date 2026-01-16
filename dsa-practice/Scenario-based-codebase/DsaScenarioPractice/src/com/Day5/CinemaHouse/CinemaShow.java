package com.Day5.CinemaHouse;

public class CinemaShow {

    private String movieName;
    private int showTime; // 24-hour format (e.g., 1430 = 2:30 PM)

    public CinemaShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return movieName + " - Show Time: " + showTime;
    }
}
