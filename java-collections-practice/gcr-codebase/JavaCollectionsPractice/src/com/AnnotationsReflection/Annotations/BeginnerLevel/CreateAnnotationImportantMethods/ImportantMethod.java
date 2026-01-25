package com.AnnotationsReflection.Annotations.BeginnerLevel.CreateAnnotationImportantMethods;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    String level() default "HIGH";
}
