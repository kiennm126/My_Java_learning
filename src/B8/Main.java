package B8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardManager cardManager = new CardManager();
        while (true) {
            System.out.println("Library Card Management Application");
            System.out.println("---------------------------------------");
            System.out.println("1. Adding a card");
            System.out.println("2. Remove a card by the borrow code ");
            System.out.println("3. Display card information list ");
            System.out.println("0. Exit the program");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter borrow code: ");
                    String borrowCode = scanner.nextLine();
                    System.out.print("Enter borrow date: ");
                    String borrowDate = scanner.nextLine();
                    System.out.print("Enter return date: ");
                    String returnDate = scanner.nextLine();
                    System.out.print("Enter book's ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student's class: ");
                    String classOfStudent = scanner.nextLine();

                    Student student = new Student(name, age, classOfStudent);
                    Card card = new Card(borrowCode, borrowDate, returnDate, bookID, student);
                    cardManager.addNewCard(card);
                    break;
                }
                case "2": {
                    System.out.print("Enter borrow to remove a card: ");
                    String borrowCode = scanner.nextLine();
                    cardManager.removeCard(borrowCode);
                    break;
                }
                case "3": {
                    cardManager.showCardList();
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