package com.Day5.FitTrackYourPersonalFitnessTracker;

public class FitTrackDemoApp {

    public static void main(String[] args) {

        FitnessUserProfile user =
                new FitnessUserProfile("Devarshi", 22, 70.5, "Weight Loss");

        user.showProfile();

        WorkoutSession workout =
                new CardioWorkoutSession(30); // Polymorphism

        workout.startWorkout();
        double calories = workout.calculateCalories();
        workout.stopWorkout();

        int dailyTarget = 500;
        double remainingCalories = dailyTarget - calories;

        System.out.println("Calories Burned: " + calories);
        System.out.println("Remaining Daily Target: " + remainingCalories);
    }
}
