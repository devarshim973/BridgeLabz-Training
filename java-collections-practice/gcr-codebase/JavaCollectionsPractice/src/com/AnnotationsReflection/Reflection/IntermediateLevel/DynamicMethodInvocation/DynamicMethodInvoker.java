package com.AnnotationsReflection.Reflection.IntermediateLevel.DynamicMethodInvocation;


import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Load class dynamically
            Class<?> clazz =
                    Class.forName("com.reflectiondynamicinvoke.MathOperations");

            // Create object dynamically
            Object obj =
                    clazz.getDeclaredConstructor().newInstance();

            // Get method dynamically
            Method method =
                    clazz.getMethod(methodName, int.class, int.class);

            // Invoke method
            Object result = method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("❌ Invalid method name.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
