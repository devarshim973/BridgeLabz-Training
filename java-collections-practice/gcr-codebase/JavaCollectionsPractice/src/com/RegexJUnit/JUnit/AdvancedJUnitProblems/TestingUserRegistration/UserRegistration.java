package com.RegexJUnit.JUnit.AdvancedJUnitProblems.TestingUserRegistration;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if (!username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$")) {
            throw new IllegalArgumentException("Invalid username");
        }
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (!password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new IllegalArgumentException("Invalid password");
        }
        // Registration logic (e.g., save to DB) can be added here
    }
}
