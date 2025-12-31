package com.Inheritance.singleinheritance;

public class LibraryManagementDemo {
    public static void main(String[] args) {
        // Create a book with author
        BookAuthor book1 = new BookAuthor(
                "Java Programming Basics",
                2023,
                "John Doe",
                "Software developer and educator with 10 years of experience."
        );

        // Display book and author info
        System.out.println("Book & Author Information:\n");
        book1.displayInfo();
    }
}
