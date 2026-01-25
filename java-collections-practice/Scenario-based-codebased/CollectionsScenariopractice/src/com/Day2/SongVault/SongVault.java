package com.Day2.SongVault;

import java.util.*;
import java.util.stream.Collectors;

public class SongVault<T extends Media> {

    private List<T> mediaList = new ArrayList<>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    // Group by Genre
    public Map<String, List<T>> groupByGenre() {
        return mediaList.stream()
                .collect(Collectors.groupingBy(Media::getGenre));
    }

    // Unique Artists
    public Set<String> getUniqueArtists() {
        return mediaList.stream()
                .map(Media::getArtist)
                .collect(Collectors.toSet());
    }

    // Filter by Artist
    public List<T> filterByArtist(String artist) {
        return mediaList.stream()
                .filter(m -> m.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    // Sort by Title
    public List<T> sortByTitle() {
        return mediaList.stream()
                .sorted(Comparator.comparing(Media::getTitle))
                .collect(Collectors.toList());
    }
}
