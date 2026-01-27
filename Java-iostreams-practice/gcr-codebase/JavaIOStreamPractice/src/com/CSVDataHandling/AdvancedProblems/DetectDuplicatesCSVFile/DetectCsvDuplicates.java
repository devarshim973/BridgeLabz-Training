package com.CSVDataHandling.AdvancedProblems.DetectDuplicatesCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectCsvDuplicates {

    public static void main(String[] args) {

        // ✅ Explicit file path
        String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        Set<String> ids = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                if (isHeader) {
                    isHeader = false; // skip header
                    continue;
                }

                String[] data = line.split(",");
                String id = data[0];

                if (!ids.add(id)) {
                    duplicates.add(id);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicate IDs found.");
            } else {
                System.out.println("Duplicate IDs found: " + duplicates);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
