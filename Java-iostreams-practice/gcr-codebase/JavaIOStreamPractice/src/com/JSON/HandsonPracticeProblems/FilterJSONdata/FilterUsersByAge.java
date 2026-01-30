package com.JSON.HandsonPracticeProblems.FilterJSONdata;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterUsersByAge {

    public static void main(String[] args) {

        String filePath = "src/main/resources/users.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON array from file
            JsonNode rootArray = mapper.readTree(new File(filePath));

            System.out.println("Users older than 25:\n");

            for (JsonNode node : rootArray) {
                int age = node.get("age").asInt();
                if (age > 25) {
                    System.out.println("ID   : " + node.get("id").asInt());
                    System.out.println("Name : " + node.get("name").asText());
                    System.out.println("Age  : " + age);
                    System.out.println("-------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
