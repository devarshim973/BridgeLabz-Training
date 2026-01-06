package com.LinearandBinarySearch.StringBufferCompareStringBufferwithStringBuilderStringConcatenation;

public class StringBuilderPerformanceTest {

    public long measureBuilderTime(int count) {

        StringBuilder builder = new StringBuilder();

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            builder.append("hello");
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}

