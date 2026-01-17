package com.Collections.MapInterface.WordFrequencyCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounterApp {

    public static void main(String[] args) {

        String filePath = "sample.txt"; // change path if needed
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(
                                word,
                                wordFrequencyMap.getOrDefault(word, 0) + 1
                        );
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display result
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
