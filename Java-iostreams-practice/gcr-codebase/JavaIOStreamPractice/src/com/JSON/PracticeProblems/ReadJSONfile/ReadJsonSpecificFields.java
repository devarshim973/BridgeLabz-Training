package com.JSON.PracticeProblems.ReadJSONfile;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonSpecificFields {

    public static void main(String[] args) {

        String filePath = "users.json"; // file in project root

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            // Convert file content to JSONArray
            JSONArray jsonArray = new JSONArray(jsonContent.toString());

            System.out.println("Extracted Fields:\n");

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject obj = jsonArray.getJSONObject(i);

                String name = obj.optString("name", "N/A");
                String email = obj.optString("email", "N/A");

                System.out.println("Name  : " + name);
                System.out.println("Email : " + email);
                System.out.println("---------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
