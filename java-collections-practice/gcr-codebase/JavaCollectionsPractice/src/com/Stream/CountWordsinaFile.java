package com.Stream;

import java.io.*;
import java.util.*;

public class CountWordsinaFile {

    public static void main(String[] args) {

        String filePath = "input.txt"; // Path to your text file
        Map<String, Integer> wordCount = new HashMap<>();

        // Step 1: Read the file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                // Split by whitespace
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue; // Skip empty strings
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
            return;
        }

        // Step 2: Sort words by frequency (descending)
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Display top 5 words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
