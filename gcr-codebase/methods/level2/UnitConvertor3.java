import java.util.Scanner;

public class UnitConvertor3 {

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for testing
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Unit Convertor -----");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        double value, result;

        switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit: ");
                value = sc.nextDouble();
                result = convertFarhenheitToCelsius(value);
                System.out.println("Celsius = " + result);
                break;

            case 2:
                System.out.print("Enter Celsius: ");
                value = sc.nextDouble();
                result = convertCelsiusToFarhenheit(value);
                System.out.println("Fahrenheit = " + result);
                break;

            case 3:
                System.out.print("Enter Pounds: ");
                value = sc.nextDouble();
                result = convertPoundsToKilograms(value);
                System.out.println("Kilograms = " + result);
                break;

            case 4:
                System.out.print("Enter Kilograms: ");
                value = sc.nextDouble();
                result = convertKilogramsToPounds(value);
                System.out.println("Pounds = " + result);
                break;

            case 5:
                System.out.print("Enter Gallons: ");
                value = sc.nextDouble();
                result = convertGallonsToLiters(value);
                System.out.println("Liters = " + result);
                break;

            case 6:
                System.out.print("Enter Liters: ");
                value = sc.nextDouble();
                result = convertLitersToGallons(value);
                System.out.println("Gallons = " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}
