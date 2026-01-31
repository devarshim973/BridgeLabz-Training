package com.StreamAPI.StreamAPI.HospitalDoctorAvailability;

import java.util.*;

public class HospitalDoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiology", true),
            new Doctor("Dr. Mehta", "Neurology", false),
            new Doctor("Dr. Singh", "Orthopedics", true),
            new Doctor("Dr. Rao", "Dermatology", true),
            new Doctor("Dr. Gupta", "Pediatrics", false)
        );

        doctors.stream()

            // filter doctors available on weekends
            .filter(Doctor::isAvailableOnWeekend)

            // sort by specialty
            .sorted(Comparator.comparing(Doctor::getSpecialty))

            // print result
            .forEach(System.out::println);
    }
}
