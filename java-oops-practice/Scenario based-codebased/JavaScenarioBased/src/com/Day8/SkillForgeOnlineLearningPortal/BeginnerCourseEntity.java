package com.Day8.SkillForgeOnlineLearningPortal;

class BeginnerCourseEntity extends LearningCourseEntity {

    public BeginnerCourseEntity(String title,
                                 InstructorUserProfile instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(StudentUserProfile student) {

        if (isCourseCompleted(student)) {
            System.out.println(
                "BEGINNER CERTIFICATE\n" +
                "Awarded to: " + student.getName() +
                "\nCourse: " + getTitle() +
                "\nStatus: Completed"
            );
        } else {
            System.out.println("Course not completed yet.");
        }
    }
}
