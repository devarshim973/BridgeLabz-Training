package com.Day6.ArtExpo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ArtExpoManagerService {

    private List<ArtExpoArtist> artistList = new ArrayList<>();

    // Add artist and maintain sorted order by registration time
    public void addArtist(ArtExpoArtist artist) {
        artistList.add(artist);
        insertionSort();
    }

    // Insertion Sort by registration time
    private void insertionSort() {
        for (int i = 1; i < artistList.size(); i++) {
            ArtExpoArtist key = artistList.get(i);
            int j = i - 1;

            while (j >= 0 && artistList.get(j).getRegistrationTime().isAfter(key.getRegistrationTime())) {
                artistList.set(j + 1, artistList.get(j));
                j--;
            }
            artistList.set(j + 1, key);
        }
    }

    // Display all artists in registration order
    public void displayArtists() {
        System.out.println("Artists sorted by registration time:");
        for (ArtExpoArtist artist : artistList) {
            System.out.println(artist);
        }
    }
}
