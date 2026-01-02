package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketCircularListManager {

    private TicketReservationNode head;
    private TicketReservationNode tail;
    private int ticketCount;

    public TicketCircularListManager() {
        head = null;
        tail = null;
        ticketCount = 0;
    }

    // Add new ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketReservationNode newNode =
                new TicketReservationNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        ticketCount++;
        System.out.println("Ticket booked successfully");
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to cancel");
            return;
        }

        TicketReservationNode temp = head;
        TicketReservationNode prev = tail;

        do {
            if (temp.ticketId == ticketId) {

                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                ticketCount--;
                System.out.println("Ticket cancelled successfully");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketReservationNode temp = head;
        System.out.println("Booked Tickets:");

        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketReservationNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for customer");
    }

    // Search by movie name
    public void searchByMovie(String movieName) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketReservationNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this movie");
    }

    // Count total tickets
    public void countTickets() {
        System.out.println("Total booked tickets: " + ticketCount);
    }

    private void displayTicket(TicketReservationNode ticket) {
        System.out.println(
                "Ticket ID: " + ticket.ticketId +
                ", Customer: " + ticket.customerName +
                ", Movie: " + ticket.movieName +
                ", Seat: " + ticket.seatNumber +
                ", Time: " + ticket.bookingTime
        );
    }
}
