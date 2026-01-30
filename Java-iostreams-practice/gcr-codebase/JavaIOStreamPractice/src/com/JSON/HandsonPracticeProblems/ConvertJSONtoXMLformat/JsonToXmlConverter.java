package com.JSON.HandsonPracticeProblems.ConvertJSONtoXMLformat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class JsonToXmlConverter {

    public static void main(String[] args) {
        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        try {
            // Read JSON file
            JsonNode jsonNode = jsonMapper.readTree(new File("file.json"));

            // Convert JSON to XML string
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            // Save XML to a file
            xmlMapper.writeValue(new File("output.xml"), jsonNode);

            System.out.println("JSON converted to XML successfully!");
            System.out.println("XML Output:\n" + xml);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
