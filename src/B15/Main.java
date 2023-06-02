package B15;

import B15.EntitiesManager.UIManager;

import java.util.Scanner;

class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nUniversity Students' Academic Results Management Program");
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Add a faculty");
            System.out.println("2. Add students to a faculty");
            System.out.println("3. Remove a student by ID");
            System.out.println("4. Show all students");
            System.out.println("5. Count students");
            System.out.println("6. Determine a student is regular or in-service (by ID)");
            System.out.println("7. Get GPAs by Semester");
            System.out.println("8. Get the student having the highest entry points of given faculty");
            System.out.println("9. Count students by faculty");
            System.out.println("10. Get the list of in-service students at a given training association of a given faculty");
            System.out.println("11. Get the list of students whose GPA in the latest semester is 3.2 or higher of a given faculty");
            System.out.println("12. Get the student with the highest GPA (in any semester) of a given faculty");
            System.out.println("13. Sort the list of students (ascending by GPA and descending by year of entry) of a given faculty");
            System.out.println("14. Statistics on the number of students by year of entry of a given faculty");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------------------------");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    UIManager.addFaculty();
                    break;
                case 2:
                    UIManager.addStudents();
                    break;
                case 3:
                    UIManager.removeStudentByID();
                    break;
                case 4:
                    UIManager.showAllStudents();
                    break;
                case 5:
                    UIManager.countStudents();
                    break;
                case 6:
                    UIManager.determineStudentType();
                    break;
                case 7:
                    UIManager.getGPAsBySemester();
                    break;
                case 8:
                    UIManager.printHighestEntryPoints();
                    break;
                case 9:
                    UIManager.countStudentsByFaculty();
                    break;
                case 10:
                    UIManager.getInServiceStudentsByTrainingAssociation();
                    break;
                case 11:
                    UIManager.getStudentsWithHighGPA();
                    break;
                case 12:
                    UIManager.findStudentWithHighestSemesterGPA();
                    break;
                case 13:
                    UIManager.sortStudentsInFaculty();
                    break;
                case 14:
                    UIManager.displayStudentCountByYearOfEntry();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}