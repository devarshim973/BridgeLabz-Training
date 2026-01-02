package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationApplication {

    public static void main(String[] args) {

        TicketCircularListManager manager =
                new TicketCircularListManager();

        manager.addTicket(1, "Amit", "Inception", "A1", "10:00 AM");
        manager.addTicket(2, "Neha", "Avatar", "B5", "10:05 AM");
        manager.addTicket(3, "Rahul", "Inception", "A2", "10:10 AM");

        manager.displayTickets();

        manager.searchByCustomer("Amit");

        manager.searchByMovie("Inception");

        manager.removeTicket(2);

        manager.displayTickets();

        manager.countTickets();
    }
}

