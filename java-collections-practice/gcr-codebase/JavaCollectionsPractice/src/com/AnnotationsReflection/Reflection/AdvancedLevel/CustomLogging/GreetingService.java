package com.AnnotationsReflection.Reflection.AdvancedLevel.CustomLogging;


public class GreetingService implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
