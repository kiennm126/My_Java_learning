package B14;

import B14.EntitiesManager.UIManager;

public class Main {
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nGraduated Recruitment Management Program");
            System.out.println("----------------------------------------");
            System.out.println("1. Add Students");
            System.out.println("2. Show Selected Candidates");
            System.out.println("3. Show All Students");
            System.out.println("4. Count the number of candidates");
            System.out.println("5. Remove a candidate by phone number");
            System.out.println("0. Exit");
            choice = UIManager.getIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    UIManager.addStudents();
                    break;
                case 2:
                    UIManager.showSelectedCandidates();
                    break;
                case 3:
                    UIManager.showAllStudents();
                    break;
                case 4:
                    UIManager.countAllCandidates();
                    break;
                case 5:
                    UIManager.deleteCandidateByPhoneNum();
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