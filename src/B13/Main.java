package B13;

import B13.EntitiesManager.UIManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIManager uiManager = new UIManager(scanner);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nEmployee Management System");
            System.out.println("--------------------------");
            System.out.println("1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Search Employees by Type");
            System.out.println("4. Edit Employee");
            System.out.println("5. Show All Employees");
            System.out.println("6. Count the number of Employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    uiManager.insertEmployee();
                    break;
                case 2:
                    uiManager.deleteEmployee();
                    break;
                case 3:
                    uiManager.searchByType();
                    break;
                case 4:
                    uiManager.editEmployee();
                    break;
                case 5:
                    uiManager.showAllEmployees();
                    break;
                case 6:
                    uiManager.countEmployeeNumber();
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}