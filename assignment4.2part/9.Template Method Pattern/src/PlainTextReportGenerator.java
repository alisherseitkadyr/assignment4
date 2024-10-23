public class PlainTextReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Report Header - Plain Text");
    }

    @Override
    protected void formatBody() {
        System.out.println("This is the body of the plain text report.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Report Footer - Plain Text");
    }
}
