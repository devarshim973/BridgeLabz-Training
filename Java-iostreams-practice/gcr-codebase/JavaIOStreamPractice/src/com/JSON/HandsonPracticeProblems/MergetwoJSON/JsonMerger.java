package com.JSON.HandsonPracticeProblems.MergetwoJSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonMerger {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Load JSON files
            JsonNode json1 = mapper.readTree(new File("file1.json"));
            JsonNode json2 = mapper.readTree(new File("file2.json"));

            // Merge JSON
            ObjectNode mergedJson = mapper.createObjectNode();

            // Add all fields from first JSON
            mergedJson.setAll((ObjectNode) json1);

            // Add all fields from second JSON (overwrites duplicates)
            mergedJson.setAll((ObjectNode) json2);

            // Save merged JSON to a new file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("merged.json"), mergedJson);

            System.out.println("JSON files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
