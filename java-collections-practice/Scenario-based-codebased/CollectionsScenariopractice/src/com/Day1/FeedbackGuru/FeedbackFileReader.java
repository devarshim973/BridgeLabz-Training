package com.Day1.FeedbackGuru;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackFileReader {

    public static List<String> readFeedbackFiles(String folderPath) {

        List<String> lines = new ArrayList<>();
        File folder = new File(folderPath);

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null) {
            System.out.println("No feedback files found.");
            return lines;
        }

        for (File file : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        return lines;
    }
}
