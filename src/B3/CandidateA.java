package B3;

public class CandidateA extends Candidate {
    public static final String mathematics = "Mathematics";
    public static final String physics = "Physics";
    public static final String chemistry = "Chemistry";

    public CandidateA(String studentID, String fullName, String address, int priority) {
        super(studentID, fullName, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate of A{" +
                "Student's ID: " + studentID +
                ", Full name: " + fullName +
                ", Address: " + address +
                ", Priority: " + priority +
                ", Subject: " + mathematics + " - " + physics + " - " + chemistry +
                '}';
    }
}