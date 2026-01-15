package com.Generics.AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningExecutionEngine {

    public static void main(String[] args) {

        SoftwareEngineerProfile se =
                new SoftwareEngineerProfile("Amit", 3);

        DataScientistProfile ds =
                new DataScientistProfile("Neha", 2);

        ProductManagerProfile pm =
                new ProductManagerProfile("Rahul", 6);

        CandidateResume<SoftwareEngineerProfile> resume1 =
                new CandidateResume<>(se);

        CandidateResume<ProductManagerProfile> resume2 =
                new CandidateResume<>(pm);

        ResumeScreeningService.screenResume(resume1.getJobRole());
        ResumeScreeningService.screenResume(resume2.getJobRole());

        // Wildcard pipeline
        List<JobRoleProfile> allCandidates = new ArrayList<>();
        allCandidates.add(se);
        allCandidates.add(ds);
        allCandidates.add(pm);

        ScreeningPipelineManager.processAllResumes(allCandidates);
    }
}
