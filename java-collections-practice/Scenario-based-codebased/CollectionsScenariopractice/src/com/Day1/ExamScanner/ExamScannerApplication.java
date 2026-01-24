package com.Day1.ExamScanner;


import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ExamScannerApplication {

    public static void main(String[] args) {

        String filePath = "answers.csv";

        List<String> lines =
                ExamFileReader.readAnswerLines(filePath);

        ExamEvaluator<MathAnswerSheet> evaluator =
                new ExamEvaluator<>();

        Map<String, Integer> scores =
                evaluator.evaluate(lines, new MathAnswerSheet());

        PriorityQueue<Map.Entry<String, Integer>> ranked =
                ScorePriorityQueue.sortScores(scores);

        System.out.println("🏆 Exam Results:");
        while (!ranked.isEmpty()) {
            Map.Entry<String, Integer> entry = ranked.poll();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
