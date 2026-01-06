package com.LinearandBinarySearch.FileReaderWordOccurrenceCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrenceCounter {

    public int countWord(String filePath, String targetWord) {

        int count = 0;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            bufferedReader.close();

        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }

        return count;
    }
}
