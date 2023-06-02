package B3;

public class Candidate {

    protected String studentID;
    protected String fullName;
    protected String address;
    protected int priority;

    public Candidate(String studentID, String fullName, String address, int priority) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}