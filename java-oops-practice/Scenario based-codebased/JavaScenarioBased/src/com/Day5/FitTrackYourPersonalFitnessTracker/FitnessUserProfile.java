package com.Day5.FitTrackYourPersonalFitnessTracker;

public class FitnessUserProfile {

    private String name;
    private int age;
    private double weight;
    private String goal;

    // Default goal constructor
    public FitnessUserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
    }

    // Custom goal constructor
    public FitnessUserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight;
    }

    public void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
    }
}
