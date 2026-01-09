package com.Day8.SkillForgeOnlineLearningPortal;

class StudentUserProfile extends PortalUserProfile {

    private int completedModules;
    private double gradeScore;

    public StudentUserProfile(String name, String email) {
        super(name, email);
        this.completedModules = 0;
        this.gradeScore = 0;
    }

    // Progress tracking using operators
    public void completeModule(double moduleScore) {
        completedModules++;
        gradeScore += moduleScore; // operator usage
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public double getAverageScore() {
        return completedModules == 0 ? 0 : gradeScore / completedModules;
    }
}
