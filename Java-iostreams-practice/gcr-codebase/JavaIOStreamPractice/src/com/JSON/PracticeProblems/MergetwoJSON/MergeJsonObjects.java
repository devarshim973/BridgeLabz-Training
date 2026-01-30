package com.JSON.PracticeProblems.MergetwoJSON;

import org.json.JSONObject;

public class MergeJsonObjects {

    public static void main(String[] args) {

        // First JSON Object
        JSONObject json1 = new JSONObject();
        json1.put("name", "Ravi");
        json1.put("email", "ravi@gmail.com");

        // Second JSON Object
        JSONObject json2 = new JSONObject();
        json2.put("age", 22);
        json2.put("city", "Delhi");

        // Merge json2 into json1
        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }

        // Print merged JSON
        System.out.println(json1.toString(4));
    }
}
