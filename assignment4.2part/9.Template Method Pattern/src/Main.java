public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
        ReportGenerator htmlReportGenerator = new HTMLReportGenerator();
        ReportGenerator plainTextReportGenerator = new PlainTextReportGenerator();

        System.out.println("Generating PDF Report:");
        reportingSystem.generateReport(pdfReportGenerator);

        System.out.println("Generating HTML Report:");
        reportingSystem.generateReport(htmlReportGenerator);

        System.out.println("Generating Plain Text Report:");
        reportingSystem.generateReport(plainTextReportGenerator);
    }
}
