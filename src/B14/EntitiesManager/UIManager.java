package B14.EntitiesManager;

import B14.Entities.GoodStudent;
import B14.Entities.GraduatedStudent;
import B14.Entities.NormalStudent;
import B14.Exceptions.InvalidDOBException;
import B14.Exceptions.InvalidFullNameException;
import B14.Exceptions.InvalidPhoneNumberException;

import java.util.List;
import java.util.Scanner;

public class UIManager {
    private static Scanner scanner = new Scanner(System.in);
    private static GraduatedStudentManager manager = new GraduatedStudentManager();

    public static String getInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int getIntegerInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void addStudents() {
        int numberOfStudents = getIntegerInput("Enter the number of students: ");
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            String fullName = getInput("Enter full name " + "(" + (i+1) + ")" + " : ");
            String doB = getInput("Enter date of birth (dd/MM/yyyy)" + "(" + (i+1) + ")" + " : ");
            String gender = getInput("Enter gender " + "(" + (i+1) + ")" + " : ");
            String phoneNumber = getInput("Enter phone number " + "(" + (i+1) + ")" + " : ");
            String universityName = getInput("Enter university name " + "(" + (i+1) + ")" + " : ");
            String gradeLevel = getInput("Enter grade level (Good/Normal) " + "(" + (i+1) + ")" + " : ");

            try {
                if (!Validator.isValidFullName(fullName)) {
                    throw new InvalidFullNameException("Invalid full name length");
                }
                if (!Validator.isValidDOB(doB)) {
                    throw new InvalidDOBException("Invalid date of birth format");
                }
                if (!Validator.isValidPhoneNumber(phoneNumber)) {
                    throw new InvalidPhoneNumberException("Invalid phone number");
                }

                if (gradeLevel.equalsIgnoreCase("Good")) {
                    double gpa = Double.parseDouble(getInput("Enter GPA " + "(" + (i+1) + ")" + " : "));
                    String bestRewardName = getInput("Enter best reward name " + "(" + (i+1) + ")" + " : ");
                    GoodStudent student = new GoodStudent(fullName, doB, gender, phoneNumber, universityName, gradeLevel, gpa, bestRewardName);
                    manager.addStudent(student);
                } else if (gradeLevel.equalsIgnoreCase("Normal")) {
                    int toeicScore = Integer.parseInt(getInput("Enter TOEIC score " + "(" + (i+1) + ")" + " : "));
                    double entryTestScore = Double.parseDouble(getInput("Enter entry test score " + "(" + (i+1) + ")" + " : "));
                    NormalStudent student = new NormalStudent(fullName, doB, gender, phoneNumber, universityName, gradeLevel, toeicScore, entryTestScore);
                    manager.addStudent(student);
                } else {
                    System.out.println("Invalid grade level. Skipping student entry.");
                }
            } catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException e) {
                System.out.println(e.getMessage() + ". Skipping student entry.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Skipping student entry.");
            } catch (Exception e) {
                System.out.println("Input files have unknown errors !!!");
            }
        }
    }

    public static void showSelectedCandidates() {
        try {
            int numberOfStudents = getIntegerInput("Enter the number of students to recruit (minimum 11, maximum 15): ");

            System.out.println("\nSelected Candidates:");
            List<GraduatedStudent> selectedCandidates = manager.selectCandidates(numberOfStudents);
            for (GraduatedStudent candidate : selectedCandidates) {
                System.out.println(candidate.getFullName() + " - " + candidate.getPhoneNumber());
            }
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("The number of enrolling candidates is not enough !!!");
        }
    }

    public static void showAllStudents() {
        System.out.println("\nAll Students:");
        manager.showAllStudents();
    }

    public static void countAllCandidates() {
        int count = manager.countCandidates();
        System.out.println("Total number of candidates: " + count);
    }

    public static void deleteCandidateByPhoneNum() {
        scanner.nextLine();
        String phoneNumber = getInput("Enter the phone number of the candidate to delete: ");

        List<GraduatedStudent> students = manager.getGraduatedStudents();
        boolean candidateFound = false;
        for (GraduatedStudent student : students) {
            if (student.getPhoneNumber().equals(phoneNumber)) {
                manager.deleteStudent(student);
                System.out.println("Candidate with phone number " + phoneNumber + " has been deleted.");
                candidateFound = true;
                break;
            }
        }

        if (!candidateFound) {
            System.out.println("Candidate with phone number " + phoneNumber + " not found.");
        }
    }
}