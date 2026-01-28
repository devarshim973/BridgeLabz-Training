package com.JSON.PracticeProblems.JSONobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonCreator {

    public static void main(String[] args) {

        // Create JSON Object
        JSONObject student = new JSONObject();

        student.put("name", "Rahul Sharma");
        student.put("age", 21);

        // Create JSON Array for subjects
        JSONArray subjects = new JSONArray();
        subjects.put("Mathematics");
        subjects.put("Physics");
        subjects.put("Computer Science");

        student.put("subjects", subjects);

        // Print JSON
        System.out.println(student.toString(4)); // pretty print
    }
}
