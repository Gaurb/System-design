package Chain_Of_Responsibility;

// Abstract Handler - defines the chain structure for leave approval requests
public abstract class Approver {

    protected Approver nextApprover; // Reference to next handler in chain

    // Set the next handler in the chain
    void setNextApprover(Approver approver){
        this.nextApprover= approver;
    }

    // Abstract method for processing leave requests
    void processLeaveRequest(int leaveDays){}
}
