import java.util.Scanner;

public class FitnessChallengeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pushUps = new int[7];

        // Input push-ups for 7 days
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter push-ups for day " + (i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }

        int total = 0;
        int activeDays = 0;

        // for-each loop to calculate total and average
        for (int count : pushUps) {

            // Skip rest day (0 push-ups)
            if (count == 0) {
                continue;
            }

            total += count;
            activeDays++;
        }

        double average = 0;
        if (activeDays > 0) {
            average = (double) total / activeDays;
        }

        // Output
        System.out.println("\n--- Fitness Summary ---");
        System.out.println("Total Push-ups: " + total);
        System.out.println("Active Days: " + activeDays);
        System.out.println("Average Push-ups: " + average);

    }
}
