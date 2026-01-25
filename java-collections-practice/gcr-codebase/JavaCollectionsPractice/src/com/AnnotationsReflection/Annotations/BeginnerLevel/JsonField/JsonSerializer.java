package com.AnnotationsReflection.Annotations.BeginnerLevel.JsonField;


import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String key = annotation.name();
                    Object value = field.get(obj);

                    if (!first) {
                        json.append(", ");
                    }
                    json.append("\"").append(key).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    first = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}
