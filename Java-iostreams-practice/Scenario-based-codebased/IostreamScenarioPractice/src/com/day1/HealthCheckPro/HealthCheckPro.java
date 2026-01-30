package com.day1.HealthCheckPro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void main(String[] args) {
        try {
            Class<?>[] controllers = {LabTestController.class}; // List all controllers
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode apiDocs = mapper.createArrayNode();

            for (Class<?> controller : controllers) {
                Method[] methods = controller.getDeclaredMethods();
                for (Method method : methods) {
                    ObjectNode methodNode = mapper.createObjectNode();
                    methodNode.put("Controller", controller.getSimpleName());
                    methodNode.put("Method", method.getName());

                    if (method.isAnnotationPresent(PublicAPI.class)) {
                        PublicAPI api = method.getAnnotation(PublicAPI.class);
                        methodNode.put("Annotation", "@PublicAPI");
                        methodNode.put("Description", api.description());
                    } else if (method.isAnnotationPresent(RequiresAuth.class)) {
                        RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                        methodNode.put("Annotation", "@RequiresAuth");
                        methodNode.put("Role", auth.role());
                    } else {
                        methodNode.put("Annotation", "MISSING");
                    }

                    apiDocs.add(methodNode);
                }
            }

            // Write API documentation to JSON file
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new java.io.File("api-docs.json"), apiDocs);

            System.out.println("API documentation generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
