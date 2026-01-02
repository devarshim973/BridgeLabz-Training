package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationNode {

    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketReservationNode next;

    public TicketReservationNode(int ticketId, String customerName,
                                 String movieName, String seatNumber,
                                 String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
