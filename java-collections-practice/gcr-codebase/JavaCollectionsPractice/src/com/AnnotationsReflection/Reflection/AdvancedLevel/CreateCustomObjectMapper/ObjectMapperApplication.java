package com.AnnotationsReflection.Reflection.AdvancedLevel.CreateCustomObjectMapper;


import java.util.HashMap;
import java.util.Map;

public class ObjectMapperApplication {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Ritika");
        data.put("marks", 89.5);

        StudentRecord student =
                CustomObjectMapper.toObject(StudentRecord.class, data);

        student.display();
    }
}
