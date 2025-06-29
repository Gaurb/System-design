package Chain_Of_Responsibility;

// Concrete Handler - approves leave up to 3 days, forwards larger requests
public class Supervisor extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=3){
            System.out.println("Supervisor Approved the leave...");
        }else if(nextApprover!=null){
            // Forward to next handler in chain
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
