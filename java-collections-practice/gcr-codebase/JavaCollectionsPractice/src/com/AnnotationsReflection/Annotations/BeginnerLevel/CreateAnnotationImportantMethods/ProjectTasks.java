package com.AnnotationsReflection.Annotations.BeginnerLevel.CreateAnnotationImportantMethods;


public class ProjectTasks {

    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void routineTask() {
        System.out.println("Executing routine task...");
    }

    public void normalTask() {
        System.out.println("Executing normal task...");
    }
}
