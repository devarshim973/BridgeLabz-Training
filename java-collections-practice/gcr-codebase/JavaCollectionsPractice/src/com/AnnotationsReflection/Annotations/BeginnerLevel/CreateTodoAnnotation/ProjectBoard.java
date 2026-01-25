package com.AnnotationsReflection.Annotations.BeginnerLevel.CreateTodoAnnotation;

public class ProjectBoard {

    @Todo(task = "Implement login API", assignedTo = "Ritika", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Login feature in progress...");
    }

    @Todo(task = "Add search functionality", assignedTo = "Devarshi")
    public void searchFeature() {
        System.out.println("Search feature pending...");
    }

    public void completedFeature() {
        System.out.println("Completed feature executed");
    }
}
