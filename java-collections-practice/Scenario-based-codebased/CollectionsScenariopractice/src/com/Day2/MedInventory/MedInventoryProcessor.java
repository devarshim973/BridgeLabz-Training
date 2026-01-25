package com.Day2.MedInventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class MedInventoryProcessor<T extends InventoryItem> {

    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Set<T> readInventory(String filePath, ItemFactory<T> factory)
            throws Exception {

        Set<T> inventorySet = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            String itemId = data[0];
            String name = data[1];
            int qty = Integer.parseInt(data[2]);
            String expiry = data[3];

            if (!DATE_PATTERN.matcher(expiry).matches()) {
                continue; // invalid date format
            }

            LocalDate expiryDate = LocalDate.parse(expiry, FORMATTER);

            T item = factory.create(itemId, name, qty, expiryDate);

            if (qty < 10) {
                throw new LowStockException("Critical low stock: " + name);
            }

            inventorySet.add(item);
        }

        reader.close();
        return inventorySet;
    }

    public Map<String, List<T>> categorizeByType(Set<T> items) {

        Map<String, List<T>> map = new HashMap<>();

        for (T item : items) {
            String key = item.getItemName();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(item);
        }
        return map;
    }

    public List<T> getExpiredItems(Set<T> items) {

        List<T> expired = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (T item : items) {
            if (item.getExpiryDate().isBefore(today)) {
                expired.add(item);
            }
        }
        return expired;
    }
}
