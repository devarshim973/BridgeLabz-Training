package FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class ReportModule implements Exportable {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV...");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF...");
    }

    // No need to implement exportToJSON() – uses default
}
