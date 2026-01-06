package com.Day5.EduMentorPersonalizedLearningPlatform;

public class PlatformUser {

    protected String name;
    protected String email;
    protected int userId;

    public PlatformUser(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("User ID: " + userId);
    }
}
