import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {
            System.out.print("Enter age  ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check voting eligibility
            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = sc.nextInt();

                // Record vote
                if (vote == 1) {
                    vote1++;
                } else if (vote == 2) {
                    vote2++;
                } else if (vote == 3) {
                    vote3++;
                } else {
                    System.out.println("Invalid vote");
                }

            } else {
                System.out.println("Not eligible to vote");
            }
        }

        // Display final result
        System.out.println("\n Election Result ");
        System.out.println("Candidate 1 Votes: " + vote1);
        System.out.println("Candidate 2 Votes: " + vote2);
        System.out.println("Candidate 3 Votes: " + vote3);

    }
}
