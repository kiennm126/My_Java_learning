package B15.EntitiesManager;

import B15.Exceptions.InvalidDOBException;
import B15.Exceptions.InvalidFullNameException;
import B15.Exceptions.InvalidYearOfEntryException;
import B15.Entities.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UIManager {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManager studentManager = new StudentManager();

    public static void addFaculty() {
        System.out.print("Enter faculty name: ");
        String name = scanner.nextLine();
        Faculty faculty = new Faculty(name);
        studentManager.addFaculty(faculty);
        System.out.println("Faculty added successfully!");
    }

    public static void addStudents() {
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();

        Faculty faculty = findFacultyByName(facultyName);
        if (faculty == null) {
            System.out.println("Faculty not found.");
            return;
        }

        int numStudents;
        do {
            System.out.print("Enter the number of students to add: ");
            numStudents = scanner.nextInt();
            scanner.nextLine();

            if (numStudents <= 0) {
                System.out.println("Invalid number of students. Please try again.");
            }
        } while (numStudents <= 0);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent #" + (i + 1));
            addStudentToFaculty(faculty);
        }
    }

    public static void addStudentToFaculty(Faculty faculty) {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter date of birth (dd-MM-yyyy): ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter year of entry: ");
        int yearOfEntry = scanner.nextInt();
        scanner.nextLine();

        try {
            if (!B15.EntitiesManager.Validator.isValidFullName(fullName)) {
                throw new InvalidFullNameException("Invalid full name length");
            }
            if (!B15.EntitiesManager.Validator.isValidDOB(dateOfBirth)) {
                throw new InvalidDOBException("Invalid date of birth format");
            }
            if (!B15.EntitiesManager.Validator.isValidYearOfEntry(yearOfEntry)) {
                throw new InvalidYearOfEntryException("Invalid phone number");
            }
        } catch (InvalidFullNameException | InvalidDOBException | InvalidYearOfEntryException e) {
            System.out.println(e.getMessage() + ". Skipping student entry.");
        } catch (Exception e) {
            System.out.println("Input files have unknown errors !!!");
        }

        double entryPoints;
        do {
            System.out.print("Enter entry points: ");
            entryPoints = scanner.nextDouble();
            scanner.nextLine();

            if (entryPoints < 0) {
                System.out.println("Entry points cannot be negative. Please try again.");
            }
        } while (entryPoints < 0);

        System.out.print("Enter semester: ");
        String semester = scanner.nextLine();

        double gpa;
        do {
            System.out.print("Enter GPA: ");
            gpa = scanner.nextDouble();
            scanner.nextLine();

            if (gpa < 0 || gpa > 4) {
                System.out.println("Invalid GPA. Please enter a value between 0 and 4.");
            }
        } while (gpa < 0 || gpa > 4);
        Student student = null;
        System.out.print("Enter student type (Regular/In service): ");
        String studentType = scanner.nextLine();
        switch (studentType) {
            case "Regular":
                student = new RegularStudent(studentID, fullName, dateOfBirth, yearOfEntry, entryPoints, new AcademicResult(semester, gpa));
                break;
            case "In service":
                System.out.print("Enter training association: ");
                String trainingAssociation = scanner.nextLine();
                student = new InServiceStudent(studentID, fullName, dateOfBirth, yearOfEntry, entryPoints, new AcademicResult(semester, gpa), trainingAssociation);
                break;
            default:
                System.out.println("Invalid type. Please try again.");
                break;
        }
        faculty.addStudent(student);
        System.out.println("Student added successfully!");
    }

    public static void removeStudentByID() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        boolean removed = studentManager.removeStudentByID(studentID);
        if (removed) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void showAllStudents() {
        studentManager.showAllStudents();
    }

    public static void countStudents() {
        int totalCount = studentManager.countStudents();
        int regularCount = studentManager.countRegularStudents();

        System.out.println("Total students: " + totalCount);
        System.out.println("Regular students: " + regularCount);
        System.out.println("In-service students: " + (totalCount - regularCount));
    }

    public static Faculty findFacultyByName(String facultyName) {
        for (Faculty faculty : studentManager.getFaculties()) {
            if (faculty.getName().equalsIgnoreCase(facultyName)) {
                return faculty;
            }
        }
        return null;
    }

    public static void determineStudentType() {
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();

        Faculty faculty = findFacultyByName(facultyName);
        if (faculty == null) {
            System.out.println("Faculty not found.");
            return;
        }

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        StudentManager studentManager = new StudentManager();
        Student student = studentManager.findStudentByID(faculty, studentID);

        if (student != null) {
            if (studentManager.isRegularStudent(student)) {
                System.out.println("Regular student");
            } else {
                System.out.println("In-service student");
            }
        } else {
            System.out.println("Student not found");
        }
    }

    public static void getGPAsBySemester() {
        System.out.print("Enter semester: ");
        String semester = scanner.nextLine();

        Map<String, Double> studentGPAs = studentManager.getGPAsBySemester(semester);
        if (studentGPAs.isEmpty()) {
            System.out.println("No students found for the given semester.");
        } else {
            System.out.println("GPAs for semester " + semester + ":");
            for (Map.Entry<String, Double> entry : studentGPAs.entrySet()) {
                String studentName = entry.getKey();
                Double gpa = entry.getValue();
                System.out.println("Student: " + studentName + ", GPA: " + gpa);
            }
        }
    }

    public static void printHighestEntryPoints() {
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();

        Student student = studentManager.getStudentWithHighestEntryPoints(facultyName);

        if (student != null) {
            System.out.println("Student with highest entry points in " + facultyName + ":");
            System.out.println("Name: " + student.getFullName());
            System.out.println("Entry Score: " + student.getEntryPoints());
        } else {
            System.out.println("No students found in " + facultyName);
        }
    }

    public static void countStudentsByFaculty() {
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();

        Faculty faculty = findFacultyByName(facultyName);
        if (faculty == null) {
            System.out.println("Faculty not found.");
            return;
        }

        int totalStudents = faculty.countStudents();
        int regularStudents = faculty.countRegularStudents();
        int inServiceStudents = totalStudents - regularStudents;

        System.out.println("Total students in " + faculty.getName() + ": " + totalStudents);
        System.out.println("Regular students in " + faculty.getName() + ": " + regularStudents);
        System.out.println("In-service students in " + faculty.getName() + ": " + inServiceStudents);
    }

    public static void getInServiceStudentsByTrainingAssociation() {
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();

        Faculty faculty = findFacultyByName(facultyName);
        if (faculty == null) {
            System.out.println("Faculty not found.");
            return;
        }

        System.out.print("Enter training association: ");
        String trainingAssociation = scanner.nextLine();

        List<Student> inServiceStudents = faculty.getInServiceStudentsByTrainingAssociation(trainingAssociation);
        if (inServiceStudents.isEmpty()) {
            System.out.println("No in-service students found at the training association: " + trainingAssociation);
        } else {
            System.out.println("In-service students at the training association: " + trainingAssociation);
            for (Student student : inServiceStudents) {
                System.out.println("Name: " + student.getFullName());
            }
        }
    }


}