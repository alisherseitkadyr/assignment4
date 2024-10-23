public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(300, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(1500, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(4000, "New Laptops");
        ExpenseRequest request4 = new ExpenseRequest(10000, "Office Renovation");

        System.out.println("Processing Request 1:");
        approvalChain.processRequest(request1);

        System.out.println("\nProcessing Request 2:");
        approvalChain.processRequest(request2);

        System.out.println("\nProcessing Request 3:");
        approvalChain.processRequest(request3);

        System.out.println("\nProcessing Request 4:");
        approvalChain.processRequest(request4);
    }
}
