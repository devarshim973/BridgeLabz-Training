package com.Exceptions.ExceptionPropagationinMethods;

public class ExceptionPropagationExample {

    static void method1() {
        // This will cause ArithmeticException
        int result = 10 / 0;
    }

    static void method2() {
        // Exception propagates from method1()
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
