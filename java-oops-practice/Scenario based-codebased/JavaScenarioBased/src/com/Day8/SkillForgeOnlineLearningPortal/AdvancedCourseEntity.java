package com.Day8.SkillForgeOnlineLearningPortal;

class AdvancedCourseEntity extends LearningCourseEntity {

    public AdvancedCourseEntity(String title,
                                 InstructorUserProfile instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(StudentUserProfile student) {

        if (isCourseCompleted(student)
            && student.getAverageScore() >= 75) {

            System.out.println(
                "ADVANCED CERTIFICATE\n" +
                "Awarded to: " + student.getName() +
                "\nCourse: " + getTitle() +
                "\nGrade: " + student.getAverageScore()
            );
        } else {
            System.out.println(
                "Certificate not generated. Grade too low or incomplete."
            );
        }
    }
}
