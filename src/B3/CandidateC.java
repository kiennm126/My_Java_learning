package B3;

public class CandidateC extends Candidate {
    public static final String literature = "Literature";
    public static final String history = "History";
    public static final String geography = "Geography";

    public CandidateC(String studentID, String fullName, String address, int priority) {
        super(studentID, fullName, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate of C{" +
                "Student's ID: " + studentID +
                ", Full name: " + fullName +
                ", Address: " + address +
                ", Priority: " + priority +
                ", Subject: " + literature + " - " + history + " - " + geography +
                '}';
    }
}