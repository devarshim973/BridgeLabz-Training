package src.com.day1.EventTracker;

public class UserActions {

    @AuditTrail(action = "User Login")
    public void login(String username) {
        // login logic
    }

    @AuditTrail(action = "File Upload")
    public void uploadFile(String filename) {
        // file upload logic
    }

    public void viewProfile(String username) {
        // not audited
    }

    @AuditTrail(action = "Delete Record")
    public void deleteRecord(int recordId) {
        // delete logic
    }
}
