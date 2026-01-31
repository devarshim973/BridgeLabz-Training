package FunctionalInterfaces.FunctionalInterfaces.TemperatureAlertSystem;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 38.0; // temperature limit

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemperature =
                temp -> temp > threshold;

        double currentTemperature = 39.5;

        if (isHighTemperature.test(currentTemperature)) {
            System.out.println("⚠ ALERT: High temperature detected!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
