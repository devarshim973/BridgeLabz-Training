package com.AnnotationsReflection.Reflection.BasicLevel.InvokePrivateMethod;


import java.lang.reflect.Method;

public class PrivateMethodInvoker {

    public static void main(String[] args) {

        try {
            // Create Calculator object
            Calculator calculator = new Calculator();

            // Get Class object
            Class<?> calculatorClass = calculator.getClass();

            // Access private method "multiply"
            Method multiplyMethod =
                    calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access to private method
            multiplyMethod.setAccessible(true);

            // Invoke method
            Object result = multiplyMethod.invoke(calculator, 5, 4);

            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
