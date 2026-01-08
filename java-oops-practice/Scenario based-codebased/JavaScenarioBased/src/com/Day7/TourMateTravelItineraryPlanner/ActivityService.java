package com.Day7.TourMateTravelItineraryPlanner;

class ActivityService {

    private double activityCost; // hidden cost

    public ActivityService(double activityCost) {
        this.activityCost = activityCost;
    }

    public double getActivityCost() {
        return activityCost;
    }
}
