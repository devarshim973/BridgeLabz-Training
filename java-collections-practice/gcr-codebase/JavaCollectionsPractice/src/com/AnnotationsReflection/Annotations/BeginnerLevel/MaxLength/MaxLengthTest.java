package com.AnnotationsReflection.Annotations.BeginnerLevel.MaxLength;


public class MaxLengthTest {

    public static void main(String[] args) {

        try {
            User user1 = new User("Ritika"); // valid
            System.out.println("Username: " + user1.getUsername());

            User user2 = new User("DevarshiMishra"); // invalid, exceeds 10
            System.out.println("Username: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
