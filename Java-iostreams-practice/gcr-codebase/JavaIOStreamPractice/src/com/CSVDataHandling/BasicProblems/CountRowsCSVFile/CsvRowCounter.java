package com.CSVDataHandling.BasicProblems.CountRowsCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvRowCounter {

    public static void main(String[] args) {

    	String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        int recordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Count non-empty records
                if (!line.trim().isEmpty()) {
                    recordCount++;
                }
            }

            System.out.println("📊 Total records (excluding header): " + recordCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
