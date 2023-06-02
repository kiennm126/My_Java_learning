package B6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        School school = new School();

        while (true) {
            System.out.println("High School students Management Application");
            System.out.println("-------------------------------------------");
            System.out.println("1. Adding a student");
            System.out.println("2. Displaying 20-years-old students information list ");
            System.out.println("3. Displaying the number of 23-years-old students from DN ");
            System.out.println("0. Exit the program");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter student's full-name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student's hometown: ");
                    String hometown = scanner.nextLine();
                    System.out.print("Enter student's class: ");
                    String classOfStudent = scanner.nextLine();
                    Student student = new Student(name, age, hometown, classOfStudent);
                    school.addNewStudent(student);
                    break;
                }
                case "2": {
                    school.get20YearOldStudents().forEach(a -> System.out.println(a.toString()));
                    break;
                }
                case "3": {
                    System.out.println(school.count23YearOldStudentsInDN() + " students");
                    break;
                }
                case "0": {
                    return;
                }
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}