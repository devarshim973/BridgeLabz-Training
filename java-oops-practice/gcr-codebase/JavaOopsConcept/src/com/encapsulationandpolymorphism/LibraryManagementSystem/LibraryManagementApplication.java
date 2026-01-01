package com.encapsulationandpolymorphism.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(
                new Book(1, "Effective Java", "Joshua Bloch")
        );
        libraryItems.add(
                new Magazine(2, "Tech Monthly", "Editorial Team")
        );
        libraryItems.add(
                new DVD(3, "Inception", "Christopher Nolan")
        );

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " +
                    item.getLoanDuration() + " days");
            System.out.println("-------------------------");
        }

        // Reservation using polymorphism + interface
        Reservable reservableItem =
                (Reservable) libraryItems.get(0);

        reservableItem.reserveItem("Rahul");
    }
}

