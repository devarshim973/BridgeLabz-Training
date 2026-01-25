package com.Generics.AIDrivenResumeScreeningSystem;

class ResumeScreeningService {

    // Generic method with bounded type parameter
    public static <T extends JobRoleProfile> void screenResume(T role) {

        System.out.println("Screening Resume...");
        System.out.println("Candidate: " + role.getCandidateName());

        if (role.isEligible()) {
            System.out.println("Status: SELECTED ✅");
        } else {
            System.out.println("Status: REJECTED ❌");
        }

        System.out.println("--------------------------------");
    }
}
