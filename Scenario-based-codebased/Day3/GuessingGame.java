import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 50; // fixed number between 1 and 100
        int guess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }

        } while (attempts < 5);

        if (guess != number) {
            System.out.println("Game Over! The correct number was: " + number);
        }

        sc.close();
    }
}
