package com.LinearandBinarySearch.StringBufferCompareStringBufferwithStringBuilderStringConcatenation;

public class StringPerformanceComparisonMain {

    public static void main(String[] args) {

        int totalStrings = 1_000_000;

        StringBufferPerformanceTest bufferTest =
                new StringBufferPerformanceTest();

        StringBuilderPerformanceTest builderTest =
                new StringBuilderPerformanceTest();

        long bufferTime = bufferTest.measureBufferTime(totalStrings);
        long builderTime = builderTest.measureBuilderTime(totalStrings);

        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
