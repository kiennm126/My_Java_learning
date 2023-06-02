package B15.Entities;

import java.util.*;

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

    public List<Student> getStudentsWithHighGPA() {
        List<Student> studentsWithHighGPA = new ArrayList<>();

        // Find the latest semester
        String latestSemester = null;
        for (Student student : students) {
            AcademicResult academicResult = student.getAcademicResult();
            if (academicResult != null) {
                String semester = academicResult.getSemester();
                if (latestSemester == null || semester.compareTo(latestSemester) > 0) {
                    latestSemester = semester;
                }
            }
        }

        // Retrieve students with high GPA in the latest semester
        for (Student student : students) {
            AcademicResult academicResult = student.getAcademicResult();
            if (academicResult != null && academicResult.getSemester().equals(latestSemester) && academicResult.getGpa() >= 3.2) {
                studentsWithHighGPA.add(student);
            }
        }

        return studentsWithHighGPA;
    }

    public Student getStudentWithHighestSemesterGPA() {
        Student studentWithHighestGPA = null;
        double highestGPA = 0.0;

        for (Student student : students) {
            AcademicResult latestResult = student.getAcademicResult();
            if (latestResult != null) {
                double semesterGPA = latestResult.getGpa();
                if (semesterGPA > highestGPA) {
                    highestGPA = semesterGPA;
                    studentWithHighestGPA = student;
                }
            }
        }

        return studentWithHighestGPA;
    }

    public void sortStudents() {
        Comparator<Student> gpaComparator = Comparator.comparingDouble(s -> s.getAcademicResult().getGpa());
        Comparator<Student> entryYearComparator = Comparator.comparingInt(Student::getYearOfEntry).reversed();

        students.sort(gpaComparator.thenComparing(entryYearComparator));
    }

    public Map<Integer, Integer> getStudentCountByYearOfEntry() {
        Map<Integer, Integer> countByYear = new HashMap<>();

        for (Student student : students) {
            int yearOfEntry = student.getYearOfEntry();
            countByYear.put(yearOfEntry, countByYear.getOrDefault(yearOfEntry, 0) + 1);
        }

        return countByYear;
    }
}