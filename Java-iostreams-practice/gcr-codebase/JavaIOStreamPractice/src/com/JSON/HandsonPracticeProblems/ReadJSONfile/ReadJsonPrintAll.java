package com.JSON.HandsonPracticeProblems.ReadJSONfile;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonPrintAll {

    public static void main(String[] args) {

        String filePath = "src/main/resources/data.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode rootNode = mapper.readTree(new File(filePath));
            printJson(rootNode, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive method to print all keys and values
    private static void printJson(JsonNode node, String indent) {

        if (node.isObject()) {

            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(indent + entry.getKey() + " :");

                printJson(entry.getValue(), indent + "  ");
            }

        } else if (node.isArray()) {

            for (JsonNode item : node) {
                printJson(item, indent + "  ");
            }

        } else {
            // value node
            System.out.println(indent + node.asText());
        }
    }
}
