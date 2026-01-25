package com.AnnotationsReflection.Annotations.BeginnerLevel.RoleAllowed;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Method-level annotation, available at runtime
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    String value(); // role name, e.g., "ADMIN"
}
