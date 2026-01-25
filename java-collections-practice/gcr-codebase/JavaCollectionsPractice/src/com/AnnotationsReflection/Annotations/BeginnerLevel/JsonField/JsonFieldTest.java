package com.AnnotationsReflection.Annotations.BeginnerLevel.JsonField;


public class JsonFieldTest {

    public static void main(String[] args) {

        User user = new User("Ritika", 25, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
