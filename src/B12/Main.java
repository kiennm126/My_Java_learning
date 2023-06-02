package B12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManagement = new VehicleManager();

        while (true) {
            System.out.println("1. Add vehicle");
            System.out.println("2. Remove vehicle");
            System.out.println("3. Find vehicles by manufacturer");
            System.out.println("4. Find vehicles by color");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle category: a. Car");
                    System.out.println("                        b. Motorcycle");
                    System.out.println("                        c. Truck");
                    String category = scanner.nextLine();

                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    System.out.print("Enter year of manufacture: ");
                    int year = scanner.nextInt();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter color: ");
                    String color = scanner.next();

                    if (category.equalsIgnoreCase("a")) {
                        System.out.print("Enter number of seats: ");
                        int numSeats = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter engine type: ");
                        String engineType = scanner.nextLine();

                        Car car = new Car(id, manufacturer, year, price, color, numSeats, engineType);
                        vehicleManagement.addVehicle(car);
                    } else if (category.equalsIgnoreCase("b")) {
                        System.out.print("Enter power: ");
                        int power = scanner.nextInt();
                        scanner.nextLine();

                        Motorcycle motorcycle = new Motorcycle(id, manufacturer, year, price, color, power);
                        vehicleManagement.addVehicle(motorcycle);
                    } else if (category.equalsIgnoreCase("c")) {
                        System.out.print("Enter tonnage: ");
                        double tonnage = scanner.nextDouble();
                        scanner.nextLine();

                        Truck truck = new Truck(id, manufacturer, year, price, color, tonnage);
                        vehicleManagement.addVehicle(truck);
                    } else {
                        System.out.println("Invalid category.");
                    }

                    break;

                case 2:
                    System.out.print("Enter ID of the vehicle to remove: ");
                    String removeId = scanner.nextLine();
                    vehicleManagement.removeVehicle(removeId);
                    break;

                case 3:
                    System.out.print("Enter manufacturer to search for: ");
                    String searchManufacturer = scanner.nextLine();
                    vehicleManagement.findVehiclesByManufacturer(searchManufacturer);
                    break;

                case 4:
                    System.out.print("Enter color to search for: ");
                    String searchColor = scanner.nextLine();
                    vehicleManagement.findVehiclesByColor(searchColor);
                    break;

                case 0:
                    vehicleManagement.exitProgram();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}