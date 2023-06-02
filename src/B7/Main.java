package B7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManagement teacherManagement = new TeacherManagement();
        while (true) {
            System.out.println("Teachers' Salary Management Application");
            System.out.println("---------------------------------------");
            System.out.println("1. Adding a teacher");
            System.out.println("2. Remove a teacher by the teacher's ID ");
            System.out.println("3. Calculate the net salary for a teacher ");
            System.out.println("4. Display teachers' information list ");
            System.out.println("0. Exit the program");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter teacher's full-name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter teacher's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter teacher's hometown: ");
                    String hometown = scanner.nextLine();
                    System.out.print("Enter teacher's ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter teacher's salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter teacher's bonus: ");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter teacher's penalty: ");
                    double penalty = scanner.nextDouble();
                    scanner.nextLine();
                    double netSalary = 0;
                    Teacher teacher = new Teacher(name, age, hometown, id, salary, bonus, penalty, netSalary);
                    teacherManagement.addTeacher(teacher);
                    break;
                }
                case "2": {
                    System.out.print("Enter ID number to remove a teacher: ");
                    String idNum = scanner.nextLine();
                    teacherManagement.removeTeacherById(idNum);
                    break;
                }
                case "3": {
                    System.out.print("Enter ID number to calculate a teacher's net salary: ");
                    String idNum = scanner.nextLine();
                    double calculated = teacherManagement.calculateNetSalary(idNum);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    String formattedNumber = decimalFormat.format(calculated);
                    System.out.println("Net salary: " + formattedNumber);
                    break;
                }
                case "4": {
                    teacherManagement.showCustomerList();
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