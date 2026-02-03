package com.Day4.NullPointerException.SystemUtilityCases;

import java.util.Optional;

class SystemUtility {

    private static final String DEFAULT_PATH = "/app/default/config";

    // 1. Read config safely
    public static Optional<String> readConfig(String key) {
        // Simulating config read (can be null)
        String value = null;
        return Optional.ofNullable(value);
    }

    // 2. Fetch environment variable
    public static Optional<String> getEnvVariable(String envKey) {
        return Optional.ofNullable(System.getenv(envKey));
    }

    // 3. Default file path
    public static String getFilePath() {
        return readConfig("file.path")
                .orElse(DEFAULT_PATH);
    }
}
