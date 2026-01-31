package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class AdvancedReportModule implements Exportable {

    @Override
    public void exportToCSV() {
        System.out.println("Advanced module exporting CSV...");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Advanced module exporting PDF...");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Advanced module exporting JSON with custom formatting...");
    }
}
