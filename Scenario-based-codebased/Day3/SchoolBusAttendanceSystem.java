import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 10 student names
        String[] students = {
                "Aarav", "Ananya", "Rohan", "Priya", "Kunal",
                "Sneha", "Arjun", "Neha", "Rahul", "Pooja"
        };

        int presentCount = 0;
        int absentCount = 0;

        // for-each loop to check attendance
        for (String name : students) {
            System.out.print(name + " (Present/Absent): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Display result
        System.out.println("\n Attendance Summary ");
        System.out.println("Total Present : " + presentCount);
        System.out.println("Total Absent  : " + absentCount);

    }
}
