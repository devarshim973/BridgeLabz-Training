package com.encapsulationandpolymorphism.LibraryManagementSystem;

interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
