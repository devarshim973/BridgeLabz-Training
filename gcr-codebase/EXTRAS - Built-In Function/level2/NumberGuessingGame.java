import java.util.Scanner;

public class NumberGuessingGame {

    //  generate a guess between low and high
    public static int generateGuess(int low, int high) {
        return (low + high) / 2; // middle value guess
    }

    //  take user feedback
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Computer will try to guess it.");

        while (!guessed && low <= high) {

            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number correctly!");
                guessed = true;
            } 
            else if (feedback.equals("high")) {
                high = guess - 1; // guess is too high
            } 
            else if (feedback.equals("low")) {
                low = guess + 1; // guess is too low
            } 
            else {
                System.out.println("Invalid feedback, try again.");
            }
        }

    }
}
