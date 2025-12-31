import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int totalVisitors = sc.nextInt();

        for (int i = 1; i <= totalVisitors; i++) {
            System.out.print("Visitor " + i + ", draw a number: ");
            int number = sc.nextInt();

            // Input validation
            if (number <= 0) {
                System.out.println("Invalid number! Try next visitor.");
                continue; // skip to next visitor
            }

            // Check if divisible by 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift.");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }
        }

        System.out.println("Lucky Draw Finished! Happy Festival!");
        sc.close();
    }
}
