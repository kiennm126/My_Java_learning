package B10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        Text text = new Text(inputText);
        System.out.println("Original Text: " + "\"" + text.getText() + "\"");

        int wordCount = text.countWords();
        System.out.println("Word Count: " + wordCount);

        int characterCount = text.countCharactersA();
        System.out.println("Number of 'A' Characters: " + characterCount);

        text.standardizeText();
        System.out.println("Standardized Text: " + "\"" + text.getText() + "\"");
    }
}