package B15.Entities;

public class AcademicResult {
    private String semester;
    private double gpa;

    public AcademicResult(String semester, double gpa) {
        this.semester = semester;
        this.gpa = gpa;
    }

    public String getSemester() {
        return semester;
    }

    public double getGpa() {
        return gpa;
    }
}