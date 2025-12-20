import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
       
	   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal:");
        double principal = sc.nextDouble();

        System.out.println("Enter rate:");
        double rate = sc.nextDouble();

        System.out.println("Enter time:");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest is " + simpleInterest);

    }
}









		