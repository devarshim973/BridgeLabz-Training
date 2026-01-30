package FunctionalInterfaces.MarkerInterfaces.DataSerializationBackup;

import java.util.Arrays;
import java.util.List;

public class BackupProcessor {

    public static void main(String[] args) {

        List<Object> objects = Arrays.asList(
                new Employee(101, "Rahul"),
                new Product(501, "Laptop"),
                "RandomString" // not serializable
        );

        for (Object obj : objects) {
            if (obj instanceof BackupSerializable) {
                System.out.println("Backing up: " + obj);
            } else {
                System.out.println("Skipping: " + obj.getClass().getSimpleName());
            }
        }
    }
}
