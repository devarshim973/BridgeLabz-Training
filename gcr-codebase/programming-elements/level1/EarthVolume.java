import java.util.*;

public class EarthVolume {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;        
        // Value of Pi from Math class
        double pi = Math.PI;
        
        // Calculate the volume of Earth in cubic kilometer
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
         // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        
     // Calculate the volume of Earth in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMiles3
        );
    }
}


