package com.Sophiaassesment;

import java.util.Scanner;

class BookingOrder{
	private String bookingId;
	
	public BookingOrder(String bookingId){
		this.bookingId = bookingId;
	}
	
	public void decodeBooking() {
		if(bookingId == null || bookingId.length() > 10) {
			System.out.println("Invalid Input");
			return;
		}
		
		String seatStr = bookingId.substring(5, 7);
		
		if(!seatStr.matches("^[0-9]{2}$")) {
			System.out.println("Invalid Count");
			return;
		}
		
		int seatCount = Integer.parseInt(seatStr);
		if(seatCount < 1 || seatCount > 10) {
			System.out.println("Invalid Count");
			return;
		}
		
		char coachNum = bookingId.charAt(7);
		
		String coachSeatNum = bookingId.substring(8, 10);
		
		if(!Character.isLetter(coachNum) || !coachSeatNum.matches("^[0-9]{2}$")) {
			System.out.println("Invalid Seat Number");
			return;
		}
		int finalSeatNum=Integer.parseInt(coachSeatNum);
		
		for(int i=0; i<seatCount; i++) {
			System.out.println(coachNum + String.format("%02d",finalSeatNum+i));
			
		}
	}
}

public class TenDigitAlphanumericBookingID{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a ten-digit alphanumeric booking ID: ");
		String bookingId = sc.nextLine();
		
		BookingOrder bo = new BookingOrder(bookingId);
		bo.decodeBooking();
	}
}
