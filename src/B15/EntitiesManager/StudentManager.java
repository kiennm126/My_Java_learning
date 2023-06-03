package B15.EntitiesManager;

import B15.Entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private List<Faculty> faculties;

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public StudentManager() {
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public boolean removeStudentByID(String studentID) {
        for (Faculty faculty : faculties) {
            if (faculty.removeStudentByID(studentID)) {
                return true;
            }
        }
        return false;
    }

    public void showAllStudents() {
        for (Faculty faculty : faculties) {
            faculty.showAllStudents();
        }
    }

    public int countStudents() {
        int count = 0;
        for (Faculty faculty : faculties) {
            count += faculty.countStudents();
        }
        return count;
    }

    public int countRegularStudents() {
        int count = 0;
        for (Faculty faculty : faculties) {
            count += faculty.countRegularStudents();
        }
        return count;
    }

    public boolean isRegularStudent(Student student) {
        return student instanceof RegularStudent;
    }

    public Student findStudentByID(Faculty faculty, String studentID) {
        for (Student student : faculty.getStudents()) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public Map<String, Double> getGPAsBySemester(String semester) {
        Map<String, Double> studentGPAs = new HashMap<>();

        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getAcademicResult().getSemester().equalsIgnoreCase(semester)) {
                    studentGPAs.put(student.getFullName(), student.getAcademicResult().getGpa());
                }
            }
        }

        return studentGPAs;
    }

    public Student getStudentWithHighestEntryPoints(String facultyName) {
        Faculty faculty = UIManager.findFacultyByName(facultyName);
        if (faculty == null) {
            return null;
        }

        List<Student> students = faculty.getStudents();
        if (students.isEmpty()) {
            return null;
        }

        Student studentWithHighestEntryPoints = students.get(0);
        double highestEntryPoints = studentWithHighestEntryPoints.getEntryPoints();

        for (Student student : students) {
            double entryPoints = student.getEntryPoints();
            if (entryPoints > highestEntryPoints) {
                highestEntryPoints = entryPoints;
                studentWithHighestEntryPoints = student;
            }
        }

        return studentWithHighestEntryPoints;
    }
}