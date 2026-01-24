package com.AnnotationsReflection.Reflection.AdvancedLevel.CustomLogging;


import java.lang.reflect.Proxy;

public class LoggingProxyApplication {

    public static void main(String[] args) {

        // Real object
        Greeting realGreeting = new GreetingService();

        // Create proxy
        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingInvocationHandler(realGreeting)
        );

        // Call method via proxy
        proxyGreeting.sayHello("Ritika");
    }
}
