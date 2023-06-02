package B3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admissions admission = new Admissions();
        while (true) {
            System.out.println("Students entering University Entrance Exam Management");
            System.out.println("------------------------------------------------------");
            System.out.println("1. Adding a new candidate");
            System.out.println("2. Displaying students information list ");
            System.out.println("3. Searching a student by the student's ID ");
            System.out.println("4. Exit the program");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a. Insert a candidate of A");
                    System.out.println("b. Insert a candidate of B");
                    System.out.println("c. Insert a candidate of C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            Candidate candidateOfA = createCandidate(scanner, "CandidateA");
                            admission.addCandidate(candidateOfA);
                            System.out.println(candidateOfA);
                            break;
                        }
                        case "b": {
                            Candidate candidateOfB = createCandidate(scanner, "CandidateB");
                            admission.addCandidate(candidateOfB);
                            System.out.println(candidateOfB);
                            break;
                        }
                        case "c": {
                            Candidate candidateOfC = createCandidate(scanner, "CandidateC");
                            admission.addCandidate(candidateOfC);
                            System.out.println(candidateOfC);
                            break;
                        }
                        default:
                            System.out.println("Invalid!");
                            break;
                    }
                    break;
                }
                case "2": {
                    admission.showListInforOfCandidate();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID to search for the student: ");
                    String studentID = scanner.nextLine();
                    admission.searchStudentByID(studentID).forEach(System.out::println);
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid!");
            }
        }
    }

    private static Candidate createCandidate(Scanner scanner, String type) {
        System.out.print("Enter student's ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter student's full-name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter student's address: ");
        String address = scanner.nextLine();
        System.out.print("Enter student's priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case "CandidateA": {
                return new CandidateA(studentID, fullName, address, priority);
            }
            case "CandidateB": {
                return new CandidateB(studentID, fullName, address, priority);
            }
            case "CandidateC": {
                return new CandidateC(studentID, fullName, address, priority);
            }
            default:
                return null;
        }
    }
}