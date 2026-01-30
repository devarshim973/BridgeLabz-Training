package com.JSON.HandsonPracticeProblems.Validateemail;

import java.io.FileInputStream;
import java.io.InputStream;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;


public class ValidateEmailField {

    public static void main(String[] args) {

        try {
            // Load JSON file
            InputStream jsonStream = new FileInputStream("src/main/resources/user.json");
            JSONObject jsonObject = new JSONObject(new JSONTokener(jsonStream));

            // Load JSON Schema
            InputStream schemaStream = new FileInputStream("src/main/resources/user-schema.json");
            JSONObject jsonSchema = new JSONObject(new JSONTokener(schemaStream));

            Schema schema = SchemaLoader.load(jsonSchema);

            // Validate JSON
            schema.validate(jsonObject); // throws ValidationException if invalid

            System.out.println("✅ JSON is valid! Email is correct.");

        } catch (org.everit.json.schema.ValidationException ve) {
            System.out.println("❌ JSON validation failed: " + ve.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
