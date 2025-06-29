package Chain_Of_Responsibility;

// Demonstrates Chain of Responsibility - leave requests pass through approval hierarchy
public class Main {
    public static void main(String[] args) {
        // Create all handlers in the approval chain
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver hr = new HR();

        // Build the chain: Supervisor -> Manager -> Director -> HR
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(hr);

        // Send request through the chain (10 days > 7, so goes to Director)
        supervisor.processLeaveRequest(10);
    }
}
