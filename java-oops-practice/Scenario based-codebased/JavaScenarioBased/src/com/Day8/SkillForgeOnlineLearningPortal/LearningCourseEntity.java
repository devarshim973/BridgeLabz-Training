package com.Day8.SkillForgeOnlineLearningPortal;

import java.util.Arrays;
import java.util.List;

abstract class LearningCourseEntity implements CertifiablePolicy {

    private String title;
    private InstructorUserProfile instructor;
    private List<String> modules;

    private double rating;           // internal review rating
    private int reviewCount;

    // Default modules constructor
    public LearningCourseEntity(String title,
                                InstructorUserProfile instructor) {
        this(title, instructor,
             Arrays.asList("Introduction", "Core Concepts", "Final Project"));
    }

    // Custom module list constructor
    public LearningCourseEntity(String title,
                                InstructorUserProfile instructor,
                                List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0;
        this.reviewCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getModules() {
        return modules;
    }

    // 🔒 Protected rating logic (encapsulation)
    protected void addReview(double reviewScore) {
        rating = (rating * reviewCount + reviewScore) / (++reviewCount);
    }

    // Read-only access
    public double getRating() {
        return rating;
    }

    // Progress check
    public boolean isCourseCompleted(StudentUserProfile student) {
        return student.getCompletedModules() == modules.size();
    }

    public abstract void generateCertificate(StudentUserProfile student);
}
