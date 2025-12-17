import java.util.*;

public class HandshakeCalculator {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);
		
		 // Take number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
		
		// Calculate maximum number of handshakes
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + handshakes);

    }
	}