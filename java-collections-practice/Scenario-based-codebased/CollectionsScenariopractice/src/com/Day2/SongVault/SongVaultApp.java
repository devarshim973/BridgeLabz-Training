package com.Day2.SongVault;

import java.util.Map;

public class SongVaultApp {

    public static void main(String[] args) {

        try {
            SongFileReader reader = new SongFileReader();

            Song song1 = reader.readSong("song1.txt");
            Song song2 = reader.readSong("song2.txt");

            SongVault<Song> vault = new SongVault<>();
            vault.addMedia(song1);
            vault.addMedia(song2);

            System.out.println("🎼 Grouped By Genre:");
            Map<String, ?> byGenre = vault.groupByGenre();
            byGenre.forEach((g, s) -> System.out.println(g + " -> " + s));

            System.out.println("\n🎤 Unique Artists:");
            vault.getUniqueArtists().forEach(System.out::println);

            System.out.println("\n🎧 Songs by Queen:");
            vault.filterByArtist("Queen").forEach(System.out::println);

            System.out.println("\n🔠 Sorted by Title:");
            vault.sortByTitle().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
