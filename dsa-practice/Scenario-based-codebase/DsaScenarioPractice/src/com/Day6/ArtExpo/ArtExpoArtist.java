package com.Day6.ArtExpo;

import java.time.LocalTime;

public class ArtExpoArtist {

    private String name;
    private LocalTime registrationTime;

    public ArtExpoArtist(String name, LocalTime registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public String getName() {
        return name;
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return name + " (" + registrationTime + ")";
    }
}
