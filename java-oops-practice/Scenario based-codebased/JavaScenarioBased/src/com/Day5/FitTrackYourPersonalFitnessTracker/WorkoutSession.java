package com.Day5.FitTrackYourPersonalFitnessTracker;

public class WorkoutSession implements ITrackableWorkout {

    protected String workoutType;
    protected int duration; // minutes
    protected double caloriesBurned;

    public WorkoutSession(String workoutType, int duration) {
        this.workoutType = workoutType;
        this.duration = duration;
    }

    public double calculateCalories() {
        return 0; // overridden by child classes
    }

    @Override
    public void startWorkout() {
        System.out.println(workoutType + " workout started.");
    }

    @Override
    public void stopWorkout() {
        System.out.println(workoutType + " workout stopped.");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

