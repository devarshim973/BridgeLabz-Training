package com.AnnotationsReflection.Annotations.BeginnerLevel.CacheResult;

public class CacheTest {

    public static void main(String[] args) {

        ExpensiveCalculator calc = new ExpensiveCalculator();

        long start1 = System.currentTimeMillis();
        System.out.println("Result: " + CacheHandler.invokeCached(calc, "fibonacci", 5));
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        System.out.println("Result: " + CacheHandler.invokeCached(calc, "fibonacci", 5));
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (end2 - start2) + " ms");

        long start3 = System.currentTimeMillis();
        System.out.println("Result: " + CacheHandler.invokeCached(calc, "fibonacci", 4));
        long end3 = System.currentTimeMillis();
        System.out.println("Time taken: " + (end3 - start3) + " ms");
    }
}
