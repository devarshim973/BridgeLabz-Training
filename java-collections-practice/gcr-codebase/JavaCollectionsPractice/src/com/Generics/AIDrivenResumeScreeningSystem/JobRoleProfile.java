package com.Generics.AIDrivenResumeScreeningSystem;

//Abstract base class for all job roles
abstract class JobRoleProfile {

 protected String candidateName;
 protected int experienceYears;

 public JobRoleProfile(String candidateName, int experienceYears) {
     this.candidateName = candidateName;
     this.experienceYears = experienceYears;
 }

 // Each role defines its own screening logic
 public abstract boolean isEligible();

 public String getCandidateName() {
     return candidateName;
 }
}
