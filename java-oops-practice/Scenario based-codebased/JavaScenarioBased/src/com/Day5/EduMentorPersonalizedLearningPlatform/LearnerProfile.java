package com.Day5.EduMentorPersonalizedLearningPlatform;

public class LearnerProfile extends PlatformUser implements ICertifiable {

    private String courseType; // Short / Full-Time

    public LearnerProfile(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("Short")) {
            System.out.println("Short Course Certificate Generated 🎯");
        } else {
            System.out.println("Full-Time Course Certificate Generated 🏆");
        }
    }
}
