package com.Generics.AIDrivenResumeScreeningSystem;

class DataScientistProfile extends JobRoleProfile {

    public DataScientistProfile(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 3;
    }
}
