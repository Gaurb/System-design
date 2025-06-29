package Chain_Of_Responsibility;

// Concrete Handler - approves leave up to 14 days, forwards larger requests
public class Director extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=14){
            System.out.println("Director Approved the leave...");
        }else if(nextApprover!=null){
            // Forward to next handler in chain
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
