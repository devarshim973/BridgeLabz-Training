package com.Day8.SkillForgeOnlineLearningPortal;

class SkillForgeExecutionEngine {

    public static void main(String[] args) {

        InstructorUserProfile instructor =
            new InstructorUserProfile("Dr. Sharma", "sharma@skillforge.com");

        StudentUserProfile student =
            new StudentUserProfile("Aarav", "aarav@gmail.com");

        LearningCourseEntity course =
            new AdvancedCourseEntity("Java Full Stack", instructor);

        // Student progress
        student.completeModule(80);
        student.completeModule(75);
        student.completeModule(90);

        System.out.println("Course Rating: " + course.getRating());

        // Certificate generation (polymorphic)
        course.generateCertificate(student);
    }
}
