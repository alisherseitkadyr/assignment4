public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<html><head><title>Report</title></head><body><h1>Report Header</h1>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<p>This is the body of the HTML report.</p>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report Footer</footer></body></html>");
    }
}
