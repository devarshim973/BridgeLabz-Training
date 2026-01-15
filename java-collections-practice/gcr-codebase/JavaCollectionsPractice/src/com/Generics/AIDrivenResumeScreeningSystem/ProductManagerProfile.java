package com.Generics.AIDrivenResumeScreeningSystem;

class ProductManagerProfile extends JobRoleProfile {

    public ProductManagerProfile(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 5;
    }
}
