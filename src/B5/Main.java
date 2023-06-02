package B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Hotel Management Application");
            System.out.println("----------------------------");
            System.out.println("1. Add a new customer");
            System.out.println("2. Remove a customer by ID card number");
            System.out.println("3. Calculate rental fee by customer's ID card number");
            System.out.println("4. Display the list of customer information");
            System.out.println("0. Exit the program");

            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter ID card number: ");
                    String idCardNum = scanner.nextLine();
                    System.out.print("Enter the number of rent days: ");
                    int rentDaysNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Choose: a. To rent a type A room");
                    System.out.println("        b. To rent a type B room");
                    System.out.println("        c. To rent a type C room");

                    Room room;
                    String choice = scanner.nextLine();
                    switch (choice){
                        case "a": {
                            room = new RoomA();
                            break;
                        }
                        case "b": {
                            room = new RoomB();
                            break;
                        }
                        case "c": {
                            room = new RoomC();
                            break;
                        }
                        default:
                            continue;
                    }

                    Customer customer = new Customer(fullName, age, idCardNum, rentDaysNum, room);
                    hotel.addNewCustomer(customer);
                    break;
                }
                case "2": {
                    System.out.print("Enter ID card number to remove a customer: ");
                    String idCard = scanner.nextLine();
                    hotel.deleteCustomerByIDCardNum(idCard);
                    break;
                }
                case "3": {
                    System.out.print("Enter ID card number to calculate rental fee: ");
                    String idCard = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculateRentalFeeByIDCardNum(idCard));
                    break;
                }
                case "4": {
                    hotel.showCustomerList();
                    break;
                }
                case "0": {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}