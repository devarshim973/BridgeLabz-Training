import java.util.Scanner;

public class TemperatureConverter {

    // convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // take temperature input from the user
    public static double getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    //  display the converted temperature
    public static void displayResult(double original, double converted, String fromUnit, String toUnit) {
        System.out.printf("%.2f %s = %.2f %s\n", original, fromUnit, converted, toUnit);
    }

    public static void main(String[] args) {
        // Convert Celsius to Fahrenheit
        double celsius = getInput("Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);
        displayResult(celsius, fahrenheit, "Celsius", "Fahrenheit");

        // Convert Fahrenheit to Celsius
        double f = getInput("Enter temperature in Fahrenheit: ");
        double c = fahrenheitToCelsius(f);
        displayResult(f, c, "Fahrenheit", "Celsius");
    }
}
