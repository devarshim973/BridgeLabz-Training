package com.Day1.ExamScanner;



import java.util.Arrays;
import java.util.List;

public class MathAnswerSheet implements AnswerSheet {

    @Override
    public List<String> getCorrectAnswers() {
        return Arrays.asList("A", "B", "C", "D", "A", "B", "C");
    }
}
