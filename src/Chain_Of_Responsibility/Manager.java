package Chain_Of_Responsibility;

// Concrete Handler - approves leave up to 7 days, forwards larger requests
public class Manager extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=7){
            System.out.println("Manager Approved the leave...");
        }else if(nextApprover!=null){
            // Forward to next handler in chain
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
