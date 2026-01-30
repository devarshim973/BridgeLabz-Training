package com.day1.HealthCheckPro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresAuth {
    String role() default "USER";
}