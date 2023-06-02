package B9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BillManager billManager = new BillManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Electricity Bill Manager Application");
            System.out.println("------------------------------------");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Edit Customer Information");
            System.out.println("4. Calculate Electricity Bill");
            System.out.println("5. Show Customer List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer's full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter customer's house number: ");
                    String houseNumber = scanner.nextLine();
                    System.out.print("Enter customer's meter code: ");
                    String meterCode = scanner.nextLine();
                    System.out.println("Enter customer's electric bill");
                    System.out.print("Enter old index: ");
                    double oldIndex = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter new index: ");
                    double newIndex = scanner.nextDouble();
                    scanner.nextLine();
                    double payment = 0;
                    Bill bill = new Bill(oldIndex, newIndex, payment);
                    Customer customer = new Customer(fullName, houseNumber, meterCode, bill);
                    billManager.addCustomer(customer);
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                    System.out.print("Enter house number to remove a customer: ");
                    String thatHouseNumber = scanner.nextLine();
                    billManager.removeCustomer(thatHouseNumber);
                    break;
                case 3:
                    System.out.print("Enter house number of customer you want to edit the information: ");
                    houseNumber = scanner.nextLine();
                    System.out.print("Enter new full name: ");
                    fullName = scanner.nextLine();
                    System.out.print("Enter new meter code: ");
                    meterCode = scanner.nextLine();
                    billManager.editCustomerInformation(houseNumber, fullName, meterCode);
                    break;
                case 4:
                    System.out.print("Enter house number to calculate electricity bill: ");
                    houseNumber = scanner.nextLine();
                    double billAmount = billManager.calculateElectricityBill(houseNumber);
                    System.out.println("Electricity bill for house number " + houseNumber + ": $" + billAmount);
                    break;
                case 5:
                    System.out.println("Customer List:");
                    billManager.showCustomerList();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}