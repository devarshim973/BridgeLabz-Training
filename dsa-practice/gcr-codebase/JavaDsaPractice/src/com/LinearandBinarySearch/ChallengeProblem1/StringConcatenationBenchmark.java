package com.LinearandBinarySearch.ChallengeProblem1;

public class StringConcatenationBenchmark {

    public void testStringBuilder() {
        long startTime = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1_000_000; i++) {
            builder.append("hello");
        }

        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }

    public void testStringBuffer() {
        long startTime = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 1_000_000; i++) {
            buffer.append("hello");
        }

        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}
