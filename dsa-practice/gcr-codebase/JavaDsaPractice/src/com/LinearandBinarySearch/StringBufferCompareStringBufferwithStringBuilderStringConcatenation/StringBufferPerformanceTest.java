package com.LinearandBinarySearch.StringBufferCompareStringBufferwithStringBuilderStringConcatenation;

public class StringBufferPerformanceTest {

    public long measureBufferTime(int count) {

        StringBuffer buffer = new StringBuffer();

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            buffer.append("hello");
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
