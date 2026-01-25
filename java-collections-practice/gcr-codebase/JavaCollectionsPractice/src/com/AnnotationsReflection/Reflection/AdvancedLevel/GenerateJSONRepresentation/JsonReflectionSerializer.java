package com.AnnotationsReflection.Reflection.AdvancedLevel.GenerateJSONRepresentation;


import java.lang.reflect.Field;

public class JsonReflectionSerializer {

    public static String toJson(Object obj) {

        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();

        json.append("{");

        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                json.append("\"")
                    .append(field.getName())
                    .append("\": ");

                Object value = field.get(obj);

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");
        return json.toString();
    }
}
