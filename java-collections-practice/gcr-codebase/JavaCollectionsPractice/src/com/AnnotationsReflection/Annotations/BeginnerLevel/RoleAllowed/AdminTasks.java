package com.AnnotationsReflection.Annotations.BeginnerLevel.RoleAllowed;


public class AdminTasks {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Profile viewed successfully.");
    }

    public void openDashboard() {
        System.out.println("Dashboard opened (no role restriction).");
    }
}
