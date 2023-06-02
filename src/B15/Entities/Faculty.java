package B15.Entities;

import java.util.List;
import java.util.ArrayList;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public void showAllStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println("Full Name: " + student.getFullName());
            System.out.println("Date of Birth: " + student.getDOB());
            System.out.println("Year of Entry: " + student.getYearOfEntry());
            System.out.println("Entry Points: " + student.getEntryPoints());
            System.out.println("Semester: " + student.getAcademicResult().getSemester());
            System.out.println("GPA: " + student.getAcademicResult().getGpa());
            System.out.println();
        }
    }

    public int countStudents() {
        return students.size();
    }

    public int countRegularStudents() {
        int count = 0;
        for (Student student : students) {
            if (student instanceof RegularStudent) {
                count++;
            }
        }
        return count;
    }

    public List<Student> getInServiceStudentsByTrainingAssociation(String trainingAssociation) {
        List<Student> inServiceStudents = new ArrayList<>();
        for (Student student : students) {
            if (student instanceof InServiceStudent) {
                InServiceStudent inServiceStudent = (InServiceStudent) student;
                if (inServiceStudent.getTrainingAssociation().equalsIgnoreCase(trainingAssociation)) {
                    inServiceStudents.add(student);
                }
            }
        }
        return inServiceStudents;
    }


}