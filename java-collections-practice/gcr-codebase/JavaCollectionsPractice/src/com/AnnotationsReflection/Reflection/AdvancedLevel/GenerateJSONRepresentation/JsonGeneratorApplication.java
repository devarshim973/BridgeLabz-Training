package com.AnnotationsReflection.Reflection.AdvancedLevel.GenerateJSONRepresentation;


public class JsonGeneratorApplication {

    public static void main(String[] args) {

        EmployeeProfile emp =
                new EmployeeProfile(1, "Ritika", 75000.50);

        String json = JsonReflectionSerializer.toJson(emp);

        System.out.println(json);
    }
}
