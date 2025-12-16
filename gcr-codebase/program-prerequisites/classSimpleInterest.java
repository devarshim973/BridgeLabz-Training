import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input Principal
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Input Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        // Input Time
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest = " + simpleInterest);

        // Close scanner
        sc.close();
    }
}
