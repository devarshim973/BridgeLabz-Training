package com.Day7.FitnessTracker;

public class FitnessUserRecord {

    private int userId;
    private String userName;
    private int stepCount;

    public FitnessUserRecord(int userId, String userName, int stepCount) {
        this.userId = userId;
        this.userName = userName;
        this.stepCount = stepCount;
    }

    public int getStepCount() {
        return stepCount;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName + " → Steps: " + stepCount;
    }
}
