package com.Day5.FitTrackYourPersonalFitnessTracker;

public class CardioWorkoutSession extends WorkoutSession {

    public CardioWorkoutSession(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8; // simple logic
        return caloriesBurned;
    }
}
