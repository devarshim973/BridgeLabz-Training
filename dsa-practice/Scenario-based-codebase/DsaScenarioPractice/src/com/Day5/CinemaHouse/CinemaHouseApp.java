package com.Day5.CinemaHouse;

import java.util.ArrayList;
import java.util.List;

public class CinemaHouseApp {

    public static void main(String[] args) {

        List<CinemaShow> dailyShows = new ArrayList<>();

        dailyShows.add(new CinemaShow("Avengers", 1800));
        dailyShows.add(new CinemaShow("Inception", 1500));
        dailyShows.add(new CinemaShow("Interstellar", 2100));
        dailyShows.add(new CinemaShow("Joker", 1300));

        System.out.println("Before Sorting:");
        for (CinemaShow show : dailyShows) {
            System.out.println(show);
        }

        ShowTimeBubbleSorter.sortByTime(dailyShows);

        System.out.println("\nAfter Sorting (By Show Time):");
        for (CinemaShow show : dailyShows) {
            System.out.println(show);
        }
    }
}
