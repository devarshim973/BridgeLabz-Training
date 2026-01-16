package com.Day5.CinemaHouse;

import java.util.List;

public class ShowTimeBubbleSorter {

    public static void sortByTime(List<CinemaShow> shows) {

        int n = shows.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (shows.get(j).getShowTime()
                        > shows.get(j + 1).getShowTime()) {

                    // Swap adjacent shows
                    CinemaShow temp = shows.get(j);
                    shows.set(j, shows.get(j + 1));
                    shows.set(j + 1, temp);
                }
            }
        }
    }
}
