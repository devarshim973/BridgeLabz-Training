package com.Day5.EduMentorPersonalizedLearningPlatform;

public class InstructorProfile extends PlatformUser {

    public InstructorProfile(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createCourse() {
        System.out.println("Instructor has created a new course.");
    }
}

