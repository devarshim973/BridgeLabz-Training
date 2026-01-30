package FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public interface Exportable {

    // Existing abstract methods
    void exportToCSV();
    void exportToPDF();

    // New feature – default implementation
    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation)");
    }
}
