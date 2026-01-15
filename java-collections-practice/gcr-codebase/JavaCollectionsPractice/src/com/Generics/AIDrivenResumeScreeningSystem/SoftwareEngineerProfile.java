package com.Generics.AIDrivenResumeScreeningSystem;

class SoftwareEngineerProfile extends JobRoleProfile {

    public SoftwareEngineerProfile(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 2;
    }
}
