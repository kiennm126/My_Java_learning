package B15.Entities;

import java.util.List;

public class Student {
    private String studentID;
    private String fullName;
    private String dOB;
    private int yearOfEntry;
    private double entryPoints;
    private AcademicResult academicResult;

    public Student(String studentID, String fullName, String dOB, int yearOfEntry, double entryPoints, AcademicResult academicResult) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.dOB = dOB;
        this.yearOfEntry = yearOfEntry;
        this.entryPoints = entryPoints;
        this.academicResult = academicResult;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDOB() {
        return dOB;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public double getEntryPoints() {
        return entryPoints;
    }

    public AcademicResult getAcademicResult() {
        return academicResult;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID: " + studentID +
                ", Full-name: " + fullName +
                ", Date of birth: " + dOB +
                ", Year of entry: " + yearOfEntry +
                ", Entry points: " + entryPoints +
                ", Academic results: " + academicResult +
                "}";
    }
}