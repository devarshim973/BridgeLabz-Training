package com.Day4.NullPointerException.SystemUtilityCases;

public class SystemUtilityMain {

    public static void main(String[] args) {

        // 1 & 3. Config + default path
        String filePath = SystemUtility.getFilePath();
        System.out.println("File Path: " + filePath);

        // 2. Environment variable
        String javaHome = SystemUtility.getEnvVariable("JAVA_HOME")
                .orElse("JAVA_HOME not set");
        System.out.println("JAVA_HOME: " + javaHome);

        // 4. API response
        ApiResponse response = new ApiResponse(null, "Success");

        String responseCode = response.getResponseCode()
                .orElse("200");
        System.out.println("Response Code: " + responseCode);

        // 5. User preferences without null check
        UserPreferences prefs = new UserPreferences(null, "EN");

        String theme = prefs.getTheme()
                .orElse("Light");
        System.out.println("Theme: " + theme);

        prefs.getLanguage().ifPresent(
                lang -> System.out.println("Language: " + lang)
        );
    }
}
