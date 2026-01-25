package com.Day1.FeedbackGuru;



public class FeedbackEntry<T> {

    private T feedbackType;
    private String feedbackText;
    private int rating;

    public FeedbackEntry(T feedbackType, String feedbackText, int rating) {
        this.feedbackType = feedbackType;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    public T getFeedbackType() {
        return feedbackType;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "[" + feedbackType + "] " + feedbackText + " (" + rating + "/10)";
    }
}
