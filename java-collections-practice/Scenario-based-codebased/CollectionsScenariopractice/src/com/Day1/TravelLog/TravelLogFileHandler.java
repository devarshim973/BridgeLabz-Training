package com.Day1.TravelLog;


import java.io.*;
import java.util.List;

public class TravelLogFileHandler {

    public static void writeTrips(String fileName, List<TravelTrip> trips) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(trips);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public static List<TravelTrip> readTrips(String fileName)
            throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        List<TravelTrip> trips = (List<TravelTrip>) ois.readObject();
        ois.close();
        return trips;
    }
}
