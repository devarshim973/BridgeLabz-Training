import java.util.Scanner;

public class RockPaperScissors {

    //  get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock"; // fallback
        }
    }

    // Method to find winner
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Tie";
        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "User" : "Computer";
            case "paper":
                return (computerChoice.equals("rock")) ? "User" : "Computer";
            case "scissors":
                return (computerChoice.equals("paper")) ? "User" : "Computer";
            default:
                return "Invalid"; // for invalid input
        }
    }

    //  calculate stats and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int ties, int totalGames) {
        String[][] stats = new String[4][2];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Ties"; stats[2][1] = String.valueOf(ties);
        double userPercent = ((double)userWins / totalGames) * 100;
        double computerPercent = ((double)computerWins / totalGames) * 100;
        stats[3][0] = "Winning Percentage";
        stats[3][1] = "User: " + String.format("%.2f", userPercent) + "%, Computer: " + String.format("%.2f", computerPercent) + "%";
        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        System.out.println("\nOverall Stats:");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + " : " + stats[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0, ties = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice for Game " + (i+1) + " (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else if (winner.equals("Tie")) ties++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, ties, n);

        // Display all results
        displayResults(gameResults, stats);
    }
}
