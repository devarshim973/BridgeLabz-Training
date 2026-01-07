package com.Day6.BookBazaarDigitalBookstoreSystem;

interface DiscountPolicy {

    // Each book type applies discount differently
    double applyDiscount(int quantity);
}
