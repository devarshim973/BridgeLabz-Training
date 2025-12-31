package com.Inheritance.multilevel;

public class PremiumDigitalCourse extends DigitalCourse {
    double fee;
    double discount; // in percent

    public PremiumDigitalCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + finalFee);
    }
}