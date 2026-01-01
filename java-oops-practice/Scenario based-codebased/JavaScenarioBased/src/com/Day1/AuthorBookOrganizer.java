package com.Day1;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class AuthorBookOrganizer {

    private Map<String, List<StoreBook>> booksByAuthor = new HashMap<>();

    public void addBook(StoreBook book) {
        booksByAuthor
            .computeIfAbsent(book.getAuthor(), a -> new ArrayList<>())
            .add(book);
    }

    public Map<String, List<StoreBook>> getBooksByAuthor() {
        return booksByAuthor;
    }
}
