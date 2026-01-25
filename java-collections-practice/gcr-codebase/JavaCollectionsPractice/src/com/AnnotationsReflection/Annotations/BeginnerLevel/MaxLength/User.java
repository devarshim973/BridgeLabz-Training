package com.AnnotationsReflection.Annotations.BeginnerLevel.MaxLength;


import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;

        // Validate fields annotated with @MaxLength
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(this);
                    if (value instanceof String) {
                        int max = field.getAnnotation(MaxLength.class).value();
                        String str = (String) value;
                        if (str.length() > max) {
                            throw new IllegalArgumentException(
                                    "Field '" + field.getName() + "' exceeds max length of " + max
                            );
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}
