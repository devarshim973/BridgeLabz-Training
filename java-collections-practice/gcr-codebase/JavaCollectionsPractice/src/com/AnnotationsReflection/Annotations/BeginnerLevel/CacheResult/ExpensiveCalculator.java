package com.AnnotationsReflection.Annotations.BeginnerLevel.CacheResult;

import java.util.concurrent.TimeUnit;

public class ExpensiveCalculator {

    @CacheResult
    public long fibonacci(int n) {
        try {
            // simulate expensive computation
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
