package com.Day1.CodeRepoCleaner;



import java.io.File;
import java.nio.file.Path;
import java.util.*;

public class FileCategorizer {

    public static Map<FileCategory, List<File>> categorizeFiles(List<Path> files) {

        Map<FileCategory, List<File>> map = new EnumMap<>(FileCategory.class);
        map.put(FileCategory.VALID, new ArrayList<>());
        map.put(FileCategory.WARNINGS, new ArrayList<>());
        map.put(FileCategory.ERRORS, new ArrayList<>());

        for (Path path : files) {
            try {
                boolean hasBadMethods =
                        !JavaCodeRegexAnalyzer.findBadMethodNames(path).isEmpty();

                boolean hasUnusedImports =
                        !JavaCodeRegexAnalyzer.findUnusedImports(path).isEmpty();

                if (!hasBadMethods && !hasUnusedImports) {
                    map.get(FileCategory.VALID).add(path.toFile());
                } else {
                    map.get(FileCategory.WARNINGS).add(path.toFile());
                }

            } catch (Exception e) {
                map.get(FileCategory.ERRORS).add(path.toFile());
            }
        }
        return map;
    }
}
