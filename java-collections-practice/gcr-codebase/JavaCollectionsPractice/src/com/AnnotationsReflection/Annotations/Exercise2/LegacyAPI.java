package com.AnnotationsReflection.Annotations.Exercise2;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is used (not recommended).");
    }

    public void newFeature() {
        System.out.println("New feature is recommended!");
    }
}
