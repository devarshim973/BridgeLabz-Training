import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        int choice;
        String operator;

        do {
            System.out.print("\nEnter Mobile Operator (Airtel/Jio/Vi): ");
            operator = sc.next();

            System.out.print("Enter Recharge Amount: ₹");
            double amount = sc.nextDouble();

            // Add recharge amount to balance
            balance += amount;

            // Display offers using switch
            switch (operator.toLowerCase()) {
                case "airtel":
                    System.out.println("Offer: 1GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Offer: Unlimited Calls + 2GB/day");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("No offers available for this operator");
            }

            // Show updated balance
            System.out.println("Current Balance: ₹" + balance);

            // Ask for another recharge
            System.out.println("\n1. Recharge Again");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("\nThank you for using Phone Recharge Simulator!");
        sc.close();
    }
}
