import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200.0; 

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km: ");
            int distance = sc.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 : 30;

            // Check sufficient balance
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("Thank you for using Delhi Metro ");
        sc.close();
    }
}
