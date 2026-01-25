package com.Day1.FeedbackGuru;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackAnalyzer<T> {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    public Map<String, List<FeedbackEntry<T>>> analyzeFeedback(
            List<String> rawFeedback, T feedbackType) {

        Map<String, List<FeedbackEntry<T>>> feedbackMap = new HashMap<>();
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        for (String line : rawFeedback) {
            try {
                int rating = extractRating(line);

                FeedbackEntry<T> entry =
                        new FeedbackEntry<>(feedbackType, line, rating);

                if (rating >= 8) {
                    feedbackMap.get("Positive").add(entry);
                } else if (rating >= 5) {
                    feedbackMap.get("Neutral").add(entry);
                } else {
                    feedbackMap.get("Negative").add(entry);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Skipping invalid feedback: " + line);
            }
        }
        return feedbackMap;
    }

    private int extractRating(String feedback) {
        Matcher matcher = RATING_PATTERN.matcher(feedback);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        throw new IllegalArgumentException("Rating not found");
    }
}
