package com.Day8.MovieTime;

import java.util.Arrays;

class MovieTime {

    // Insert a new showtime into a sorted array using Insertion Sort logic
    public static int[] insertShowTime(int[] showTimes, int newShow) {

        int n = showTimes.length;
        int[] updated = Arrays.copyOf(showTimes, n + 1);

        int i = n - 1;

        // Shift elements to the right to make space
        while (i >= 0 && updated[i] > newShow) {
            updated[i + 1] = updated[i];
            i--;
        }

        updated[i + 1] = newShow;

        return updated;
    }

    // Display showtimes
    public static void displayShowTimes(int[] showTimes) {
        for (int time : showTimes) {
            int hours = time / 60;
            int minutes = time % 60;
            System.out.printf("%02d:%02d ", hours, minutes);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Existing nearly sorted showtimes (in minutes)
        int[] showTimes = {600, 630, 660, 720}; // 10:00, 10:30, 11:00, 12:00

        System.out.println("Current Showtimes:");
        displayShowTimes(showTimes);

        // New show added in real time
        int newShow = 645; // 10:45

        showTimes = insertShowTime(showTimes, newShow);

        System.out.println("Updated Showtimes:");
        displayShowTimes(showTimes);
    }
}
