package com.Day1.FeedbackGuru;



import java.util.List;
import java.util.Map;

public class FeedbackGuruApplication {

    public static void main(String[] args) {

        String folderPath = "feedback"; // folder with .txt files

        List<String> feedbackLines =
                FeedbackFileReader.readFeedbackFiles(folderPath);

        FeedbackAnalyzer<String> analyzer =
                new FeedbackAnalyzer<>();

        Map<String, List<FeedbackEntry<String>>> result =
                analyzer.analyzeFeedback(feedbackLines, "Service");

        System.out.println("\n📊 Feedback Summary\n");

        result.forEach((category, entries) -> {
            System.out.println("=== " + category + " Feedback ===");
            entries.forEach(System.out::println);
            System.out.println();
        });
    }
}
