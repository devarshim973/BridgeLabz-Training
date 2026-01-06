package com.Day5.EduMentorPersonalizedLearningPlatform;

public class EduMentorApp {

    public static void main(String[] args) {

        LearnerProfile learner =
                new LearnerProfile("Devarshi", "dev@edumentor.com", 101, "Full-Time");

        learner.displayUserInfo();

        String[] questions = {
                "Java is OOP?",
                "Interface supports multiple inheritance?"
        };

        String[] answers = {"Yes", "Yes"};

        AssessmentQuiz quiz = new AssessmentQuiz(questions, answers);

        String[] userResponses = {"Yes", "Yes"};
        quiz.submitAnswers(userResponses);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");

        learner.generateCertificate();
    }
}
