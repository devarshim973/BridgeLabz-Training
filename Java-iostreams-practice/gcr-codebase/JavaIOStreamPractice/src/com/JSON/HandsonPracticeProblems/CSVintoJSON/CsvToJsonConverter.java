package com.JSON.HandsonPracticeProblems.CSVintoJSON;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvToJsonConverter {

    public static void main(String[] args) {
        try {
            // CSV file
            File csvFile = new File("data.csv");

            // Create CSV mapper
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema csvSchema = CsvSchema.emptySchema().withHeader(); // Use first row as header

            // Read CSV into list of maps
            MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class)
                    .with(csvSchema)
                    .readValues(csvFile);
            List<Map<String, String>> csvData = iterator.readAll();

            // Convert list to JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(csvData);

            // Save JSON to file
            jsonMapper.writeValue(new File("output.json"), csvData);

            System.out.println("CSV converted to JSON successfully!");
            System.out.println("JSON Output:\n" + json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
