package com.Generics.AIDrivenResumeScreeningSystem;

//Generic Resume restricted to JobRoleProfile
class CandidateResume<T extends JobRoleProfile> {

 private T jobRole;

 public CandidateResume(T jobRole) {
     this.jobRole = jobRole;
 }

 public T getJobRole() {
     return jobRole;
 }
}
