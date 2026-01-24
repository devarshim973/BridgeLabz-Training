package com.Day1.CodeRepoCleaner;


import java.io.File;
import java.nio.file.Path;
import java.util.*;

public class CodeRepoCleanerApplication {

    public static void main(String[] args) throws Exception {

        String rootFolder = "src"; // shared code repo

        List<Path> javaFiles = JavaFileScanner.scanJavaFiles(rootFolder);

        Map<FileCategory, List<File>> categorized =
                FileCategorizer.categorizeFiles(javaFiles);

        System.out.println("=== Code Repository Report ===");

        categorized.forEach((type, files) -> {
            System.out.println(type + " : " + files.size());
        });

        System.out.println("\nLarge Java files (>5KB):");
        FileFilterUtility
                .filterBySize(categorized.get(FileCategory.WARNINGS), 5 * 1024)
                .forEach(f -> System.out.println(f.getName()));
    }
}
