package B4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of families in town:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            // Input for each family
            System.out.println("Enter address of family " + (i + 1) + ":");
            String address = scanner.nextLine();

            // Enter person number in family
            List<Person> people = new ArrayList<>();
            System.out.println("Enter the number of person in family " + (i + 1) + ":");
            int number = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < number; j++) {
                // Input person for family
                System.out.println("Enter name of person " + (j + 1) + " in family " + (i + 1) + ":");
                String name = scanner.nextLine();
                System.out.println("Enter age of person " + (j + 1) + " in family " + (i + 1) + ":");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter job of person " + (j + 1) + " in family " + (i + 1) + ":");
                String job = scanner.nextLine();
                System.out.println("Enter ID card number of person " + (j + 1) + " in family " + (i + 1) + ":");
                String idCardNumber = scanner.nextLine();

                // Create a Person object and add it to the list of people
                people.add(new Person(name, age, job, idCardNumber));
            }

            // Create a Family object and add it to the list of family
            town.addFamily(new Family(people, address));
        }
            // Print family details
            List<Family> families = town.getFamilies();
            for (Family family : families) {
                System.out.println("Family Address: " + family.getAddress());
                List<Person> peoples = family.getPeople();
                for (int a = 0; a < peoples.size(); a++) {
                    Person person = peoples.get(a);
                    System.out.println("Person " + (a + 1) + " - Name: " + person.getName()
                                                           + " - Age: " + person.getAge()
                                                           + " - Job: " + person.getJob()
                                                           + " - ID Card Number: " + person.getIdCardNumber());
                }
            }
    }
}