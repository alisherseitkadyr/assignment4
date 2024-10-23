public class ApprovalChain {
    private Approver chain;

    public ApprovalChain() {
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        this.chain = teamLead;
    }

    public void processRequest(ExpenseRequest request) {
        chain.handleRequest(request);
    }
}
