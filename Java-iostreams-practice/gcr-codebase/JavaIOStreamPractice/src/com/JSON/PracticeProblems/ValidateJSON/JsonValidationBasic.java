package com.JSON.PracticeProblems.ValidateJSON;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidationBasic {

    public static void main(String[] args) {

        String filePath = "src/main/resources/users.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File(filePath));
            System.out.println("✅ JSON is VALID and well-formed");
        } catch (Exception e) {
            System.out.println("❌ Invalid JSON structure");
            e.printStackTrace();
        }
    }
}
