package com.Day1.CodeRepoCleaner;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaCodeRegexAnalyzer {

    // camelCase method naming
    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\bvoid\\s+([A-Z_][a-zA-Z0-9_]*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([\\w\\.]+);");

    public static List<String> findBadMethodNames(Path file) throws IOException {

        List<String> issues = new ArrayList<>();
        List<String> lines = Files.readAllLines(file);

        for (String line : lines) {
            Matcher matcher = METHOD_PATTERN.matcher(line);
            if (matcher.find()) {
                issues.add("Invalid method name: " + matcher.group(1));
            }
        }
        return issues;
    }

    public static Set<String> findUnusedImports(Path file) throws IOException {

        Set<String> imports = new HashSet<>();
        String content = Files.readString(file);

        Matcher matcher = IMPORT_PATTERN.matcher(content);
        while (matcher.find()) {
            imports.add(matcher.group(1));
        }

        Set<String> unused = new HashSet<>();
        for (String imp : imports) {
            String className = imp.substring(imp.lastIndexOf('.') + 1);
            if (!content.contains(className + ".")) {
                unused.add(imp);
            }
        }
        return unused;
    }
}
