package FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class ExportApp {

    public static void main(String[] args) {

        Exportable basicReport = new ReportModule();
        basicReport.exportToCSV();
        basicReport.exportToPDF();
        basicReport.exportToJSON(); // default method

        System.out.println();

        Exportable advancedReport = new AdvancedReportModule();
        advancedReport.exportToCSV();
        advancedReport.exportToPDF();
        advancedReport.exportToJSON(); // overridden method
    }
}
