package com.Day1.CodeRepoCleaner;



import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class JavaFileScanner {

    public static List<Path> scanJavaFiles(String rootFolder) throws IOException {

        List<Path> javaFiles = new ArrayList<>();

        Files.walk(Paths.get(rootFolder))
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(javaFiles::add);

        return javaFiles;
    }
}
