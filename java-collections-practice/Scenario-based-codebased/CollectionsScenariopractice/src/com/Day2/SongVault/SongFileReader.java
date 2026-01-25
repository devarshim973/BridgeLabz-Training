package com.Day2.SongVault;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongFileReader {

    private static final Pattern TITLE = Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST = Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION = Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE = Pattern.compile("Genre:\\s*(.*)");

    public Song readSong(String filePath) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String title = null, artist = null, duration = null, genre = null;
        String line;

        while ((line = reader.readLine()) != null) {

            Matcher m1 = TITLE.matcher(line);
            Matcher m2 = ARTIST.matcher(line);
            Matcher m3 = DURATION.matcher(line);
            Matcher m4 = GENRE.matcher(line);

            if (m1.matches()) title = m1.group(1);
            else if (m2.matches()) artist = m2.group(1);
            else if (m3.matches()) duration = m3.group(1);
            else if (m4.matches()) genre = m4.group(1);
        }

        reader.close();
        return new Song(title, artist, duration, genre);
    }
}
