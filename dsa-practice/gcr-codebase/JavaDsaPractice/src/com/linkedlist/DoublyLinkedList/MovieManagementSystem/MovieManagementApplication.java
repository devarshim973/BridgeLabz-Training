package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieManagementApplication {

    public static void main(String[] args) {

        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();

        movieList.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        movieList.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        movieList.displayForward();

        movieList.updateRating("Avatar", 8.0);

        movieList.searchByDirector("Christopher Nolan");

        movieList.searchByRating(8.0);

        movieList.displayReverse();

        movieList.removeByTitle("Titanic");

        movieList.displayForward();
    }
}
