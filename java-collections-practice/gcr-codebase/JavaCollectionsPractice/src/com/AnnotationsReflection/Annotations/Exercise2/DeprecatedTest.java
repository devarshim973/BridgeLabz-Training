package com.AnnotationsReflection.Annotations.Exercise2;


public class DeprecatedTest {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        // Using deprecated method (will show compiler warning)
        api.oldFeature();

        // Using new recommended method
        api.newFeature();
    }
}
