package com.Day5.FitTrackYourPersonalFitnessTracker;

public class StrengthWorkoutSession extends WorkoutSession {

    public StrengthWorkoutSession(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 6;
        return caloriesBurned;
    }
}

