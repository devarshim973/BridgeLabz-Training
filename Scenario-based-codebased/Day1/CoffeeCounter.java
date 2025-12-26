import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gstRate = 0.18; // 18% GST

        while (true) {

            // Ask for coffee type
            System.out.println("\nEnter coffee type (espresso / latte / cappuccino) or type 'exit' to stop:");
            String coffeeType = sc.nextLine().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe ☕");
                break;
            }

            // Ask for quantity
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double pricePerCup = 0;

            // Select coffee price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            // Calculate bill
            double totalAmount = pricePerCup * quantity;
            double gstAmount = totalAmount * gstRate;
            double finalBill = totalAmount + gstAmount;

            // Display bill details
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : ₹" + totalAmount);
            System.out.println("GST (18%)   : ₹" + gstAmount);
            System.out.println("Total Bill  : ₹" + finalBill);
        }

        sc.close();
    }
}
