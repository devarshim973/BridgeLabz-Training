package com.AnnotationsReflection.Reflection.AdvancedLevel.DependencyInjectionReflection;

public class DIApplication {

    public static void main(String[] args) {

        // Get UserController with dependencies injected
        UserController userController = SimpleDIContainer.getBean(UserController.class);

        // Use it
        userController.process();
    }
}
