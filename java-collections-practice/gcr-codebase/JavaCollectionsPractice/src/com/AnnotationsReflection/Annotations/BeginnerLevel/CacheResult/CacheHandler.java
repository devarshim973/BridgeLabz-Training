package com.AnnotationsReflection.Annotations.BeginnerLevel.CacheResult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeCached(Object obj, String methodName, Object... args) {
        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getDeclaredMethod(methodName, int.class);

            if (method.isAnnotationPresent(CacheResult.class)) {
                // Create a cache key
                String key = methodName + "#" + args[0];

                if (cache.containsKey(key)) {
                    System.out.println("Returning cached result for: " + key);
                    return cache.get(key);
                } else {
                    Object result = method.invoke(obj, args);
                    cache.put(key, result);
                    return result;
                }
            } else {
                // if not annotated, invoke normally
                return method.invoke(obj, args);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
