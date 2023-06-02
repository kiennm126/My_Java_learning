package B11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of Complex Number 1:");
        double realPart1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of Complex Number 1:");
        double imaginaryPart1 = scanner.nextDouble();
        ComplexNumber number1 = ComplexNumber.enterComplexNumber(realPart1, imaginaryPart1);

        System.out.println("Enter the real part of Complex Number 2:");
        double realPart2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of Complex Number 2:");
        double imaginaryPart2 = scanner.nextDouble();
        ComplexNumber number2 = ComplexNumber.enterComplexNumber(realPart2, imaginaryPart2);

        System.out.println("Complex Number 1:");
        number1.showComplexNumber();

        System.out.println("Complex Number 2:");
        number2.showComplexNumber();

        ComplexNumber sum = number1.addComplexNumber(number2);
        System.out.println("Sum of Complex Numbers:");
        sum.showComplexNumber();

        ComplexNumber product = number1.multiplyComplexNumber(number2);
        System.out.println("Product of Complex Numbers:");
        product.showComplexNumber();
    }
}