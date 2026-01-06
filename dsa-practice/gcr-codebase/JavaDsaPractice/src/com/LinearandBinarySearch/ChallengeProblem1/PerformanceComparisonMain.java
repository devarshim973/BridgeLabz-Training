package com.LinearandBinarySearch.ChallengeProblem1;

public class PerformanceComparisonMain {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // Assume large file exists

        System.out.println("---- String Concatenation Test ----");
        StringConcatenationBenchmark benchmark =
                new StringConcatenationBenchmark();
        benchmark.testStringBuilder();
        benchmark.testStringBuffer();

        System.out.println("\n---- File Reading Test ----");
        LargeFileWordAnalyzer analyzer =
                new LargeFileWordAnalyzer();
        analyzer.readUsingFileReader(filePath);
        analyzer.readUsingInputStreamReader(filePath);
    }
}
