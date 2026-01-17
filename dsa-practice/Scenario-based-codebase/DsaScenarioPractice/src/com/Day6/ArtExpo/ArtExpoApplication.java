package com.Day6.ArtExpo;

import java.time.LocalTime;

public class ArtExpoApplication {

    public static void main(String[] args) {

        ArtExpoManagerService manager = new ArtExpoManagerService();

        // Real-time registrations
        manager.addArtist(new ArtExpoArtist("Alice", LocalTime.of(10, 15)));
        manager.addArtist(new ArtExpoArtist("Bob", LocalTime.of(9, 45)));
        manager.addArtist(new ArtExpoArtist("Carol", LocalTime.of(10, 5)));
        manager.addArtist(new ArtExpoArtist("Dave", LocalTime.of(9, 50)));

        // Display sorted artist list
        manager.displayArtists();
    }
}
