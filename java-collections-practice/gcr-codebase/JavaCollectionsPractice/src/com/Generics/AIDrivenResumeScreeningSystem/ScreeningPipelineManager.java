package com.Generics.AIDrivenResumeScreeningSystem;

import java.util.List;

class ScreeningPipelineManager {

    // Wildcard method – READ ONLY list
    public static void processAllResumes(
            List<? extends JobRoleProfile> roles) {

        for (JobRoleProfile role : roles) {
            ResumeScreeningService.screenResume(role);
        }
    }
}
