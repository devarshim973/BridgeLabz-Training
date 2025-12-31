import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Input INR amount
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            // Input target currency
            System.out.println("Select currency to convert to:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter option (1-4): ");
            int option = sc.nextInt();

            double converted = 0;

            // Switch to apply correct conversion rate
            switch(option) {
                case 1:
                    converted = inr * 0.012; // 1 INR = 0.012 USD
                    System.out.println(inr + " INR = " + converted + " USD");
                    break;
                case 2:
                    converted = inr * 0.011; // 1 INR = 0.011 EUR
                    System.out.println(inr + " INR = " + converted + " EUR");
                    break;
                case 3:
                    converted = inr * 0.0096; // 1 INR = 0.0096 GBP
                    System.out.println(inr + " INR = " + converted + " GBP");
                    break;
                case 4:
                    converted = inr * 1.63; // 1 INR = 1.63 JPY
                    System.out.println(inr + " INR = " + converted + " JPY");
                    break;
                default:
                    System.out.println("Invalid option selected.");
            }

            // Ask if user wants another conversion
            System.out.print("Do you want to convert another amount? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the Currency Converter!");

    }
}
