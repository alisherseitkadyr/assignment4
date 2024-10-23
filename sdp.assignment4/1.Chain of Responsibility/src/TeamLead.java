public class TeamLead extends Approver {
    private final double APPROVAL_LIMIT = 500;

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("TeamLead approved the request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
