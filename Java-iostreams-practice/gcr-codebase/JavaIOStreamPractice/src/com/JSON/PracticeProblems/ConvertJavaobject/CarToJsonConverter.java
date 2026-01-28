package com.JSON.PracticeProblems.ConvertJavaobject;

import org.json.JSONObject;

public class CarToJsonConverter {

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car(101, "Toyota", "Fortuner", 4200000);

        // Convert to JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", car.getId());
        jsonObject.put("brand", car.getBrand());
        jsonObject.put("model", car.getModel());
        jsonObject.put("price", car.getPrice());

        // Print JSON
        System.out.println(jsonObject.toString(4));
    }
}
