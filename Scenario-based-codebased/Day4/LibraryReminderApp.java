import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dueDate, returnDate;
        int fine;

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter due date (day number): ");
            dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                fine = lateDays * 5;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        sc.close();
    }
}
