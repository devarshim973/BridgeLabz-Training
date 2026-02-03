package com.Day4.NullPointerException.SystemUtilityCases;

import java.util.Optional;

class ApiResponse {

    private String responseCode;  // may be null
    private String message;       // may be null

    public ApiResponse(String responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    // 4. Safe API response handling
    public Optional<String> getResponseCode() {
        return Optional.ofNullable(responseCode);
    }

    public Optional<String> getMessage() {
        return Optional.ofNullable(message);
    }
}
