package com.LinearandBinarySearch.ChallengeProblem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LargeFileWordAnalyzer {

    public void readUsingFileReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();

        } catch (IOException exception) {
            System.out.println("FileReader Error: " + exception.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCount);
        System.out.println("FileReader Time: " + (endTime - startTime) + " ns");
    }

    public void readUsingInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(filePath),
                                    StandardCharsets.UTF_8
                            )
                    );

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();

        } catch (IOException exception) {
            System.out.println("InputStreamReader Error: " + exception.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCount);
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ns");
    }
}
