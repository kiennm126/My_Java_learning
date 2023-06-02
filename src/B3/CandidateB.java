package B3;

public class CandidateB extends Candidate {
    public static final String mathematics = "Mathematics";
    public static final String biology = "Biology";
    public static final String chemistry = "Chemistry";

    public CandidateB(String studentID, String fullName, String address, int priority) {
        super(studentID, fullName, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate of B{" +
                "Student's ID: " + studentID +
                ", Full name: " + fullName +
                ", Address: " + address +
                ", Priority: " + priority +
                ", Subject: " + mathematics + " - " + biology + " - " + chemistry +
                '}';
    }
}