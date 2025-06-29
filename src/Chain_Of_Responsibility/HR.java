package Chain_Of_Responsibility;

// Final Handler - handles requests that exceed all previous approval limits
public class HR extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        // End of chain - handle requests beyond director's authority
        System.out.println("We need to further discuss...");
    }
}
