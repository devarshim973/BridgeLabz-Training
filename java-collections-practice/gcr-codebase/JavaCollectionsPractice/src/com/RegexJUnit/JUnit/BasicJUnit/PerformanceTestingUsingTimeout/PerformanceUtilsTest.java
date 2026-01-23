package com.RegexJUnit.JUnit.BasicJUnit.PerformanceTestingUsingTimeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        utils.longRunningTask();
    }
}
