package com.Day4.NullPointerException.SystemUtilityCases;

import java.util.Optional;

class UserPreferences {

    private String theme;    // may be null
    private String language; // may be null

    public UserPreferences(String theme, String language) {
        this.theme = theme;
        this.language = language;
    }

    // 5. Avoid null checks
    public Optional<String> getTheme() {
        return Optional.ofNullable(theme);
    }

    public Optional<String> getLanguage() {
        return Optional.ofNullable(language);
    }
}
