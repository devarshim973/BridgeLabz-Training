package com.day1.HealthCheckPro;

public class LabTestController {

    @PublicAPI(description = "Get all lab tests")
    public void getAllLabTests() {
        // logic here
    }

    @RequiresAuth(role = "ADMIN")
    public void createLabTest() {
        // logic here
    }

    public void deleteLabTest() {
        // Missing annotation, should be flagged
    }
}
