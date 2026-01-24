package com.Day1.CodeRepoCleaner;



import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileFilterUtility {

    public static List<File> filterBySize(List<File> files, long minSizeBytes) {
        return files.stream()
                .filter(f -> f.length() >= minSizeBytes)
                .collect(Collectors.toList());
    }

    public static List<File> filterByLastModified(List<File> files, Date afterDate) {
        return files.stream()
                .filter(f -> new Date(f.lastModified()).after(afterDate))
                .collect(Collectors.toList());
    }
}
