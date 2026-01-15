package com.day4.EventManager;

public class EventManagerApplication {

    public static void main(String[] args) {

        EventTicket[] tickets = {
            new EventTicket("Concert", 2500),
            new EventTicket("Comedy Show", 800),
            new EventTicket("Theatre", 1500),
            new EventTicket("Sports Match", 3000),
            new EventTicket("Workshop", 500)
        };

        System.out.println("Before Sorting:");
        for (EventTicket ticket : tickets) {
            ticket.displayTicket();
        }

        TicketQuickSorter sorter = new TicketQuickSorter();
        sorter.sortByPrice(tickets);

        System.out.println("\nAfter Sorting (By Price):");
        for (EventTicket ticket : tickets) {
            ticket.displayTicket();
        }

        System.out.println("\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            tickets[i].displayTicket();
        }
    }
}
