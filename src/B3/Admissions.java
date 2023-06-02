package B3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Admissions {
    private List<Candidate> candidate;

    public Admissions() {
        this.candidate = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        this.candidate.add(candidate);
    }

    public void showListInforOfCandidate() {
        this.candidate.forEach(a -> System.out.println(a.toString()));
    }

    public List<Candidate> searchStudentByID(String studentID) {
        return this.candidate.stream()
                .filter(a -> a.getStudentID()
                .contains(studentID))
                .collect(Collectors.toList());
    }
}