import java.util.Random;

public class StudentVoteChecker {

    // generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // Generate age between 10 and 25
            ages[i] = rand.nextInt(16) + 10; // 10 to 25 inclusive
        }
        return ages;
    }

    //check if students can vote
    public static String[][] canStudentVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store age
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // display the 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Student\tAge\tVoting Eligibility");
        System.out.println(" ");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random ages
        int[] ages = generateRandomAges(numberOfStudents);

        String[][] votingData = canStudentVote(ages);

        displayResults(votingData);
    }
}
