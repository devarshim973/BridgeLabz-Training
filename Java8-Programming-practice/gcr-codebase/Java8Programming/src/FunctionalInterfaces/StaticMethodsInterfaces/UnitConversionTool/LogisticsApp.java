package FunctionalInterfaces.StaticMethodsInterfaces.UnitConversionTool;

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 50;
        double weightKg = 10;

        System.out.println("Miles: " + UnitConverter.kmToMiles(distanceKm));
        System.out.println("Kilometers: " + UnitConverter.milesToKm(31));
        System.out.println("Pounds: " + UnitConverter.kgToLbs(weightKg));
        System.out.println("Kilograms: " + UnitConverter.lbsToKg(22));
    }
}
