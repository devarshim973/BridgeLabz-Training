package com.JSON.PracticeProblems.JSONandfilter;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonByAge {

    public static void main(String[] args) {

        String filePath = "src/main/resources/students.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode rootArray = mapper.readTree(new File(filePath));

            System.out.println("Students with age > 25:\n");

            for (JsonNode node : rootArray) {

                int age = node.get("age").asInt();

                if (age > 25) {
                    System.out.println(node.toPrettyString());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
