package com.AnnotationsReflection.Reflection.AdvancedLevel.CustomLogging;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {

        // Log before method execution
        System.out.println("[LOG] Method called: " + method.getName());

        // Call actual method
        return method.invoke(target, args);
    }
}
