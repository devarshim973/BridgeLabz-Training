package com.Day1;

import java.util.HashSet;
import java.util.Set;

class UniqueAuthorTracker {

    private Set<String> authorSet = new HashSet<>();

    public void registerAuthor(String authorName) {
        authorSet.add(authorName);
    }

    public Set<String> getAuthors() {
        return authorSet;
    }
}
