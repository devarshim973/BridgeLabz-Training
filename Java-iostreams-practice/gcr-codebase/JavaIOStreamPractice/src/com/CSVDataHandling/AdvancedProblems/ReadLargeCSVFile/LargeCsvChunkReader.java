package com.CSVDataHandling.AdvancedProblems.ReadLargeCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class LargeCsvChunkReader {

    public static void main(String[] args) {

        int CHUNK_SIZE = 100;
        int totalRecords = 0;
        int currentChunkCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {

            String line;

            // Skip header (if present)
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                // Process the line (business logic)
                totalRecords++;
                currentChunkCount++;

                if (currentChunkCount == CHUNK_SIZE) {
                    System.out.println("Processed records: " + totalRecords);
                    currentChunkCount = 0;
                }
            }

            if (currentChunkCount > 0) {
                System.out.println("Processed records: " + totalRecords);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
