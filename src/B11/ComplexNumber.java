package B11;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public static ComplexNumber enterComplexNumber(double realPart, double imaginaryPart) {
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void showComplexNumber() {
        System.out.println(realPart + " + " + imaginaryPart + "i");
    }

    public ComplexNumber addComplexNumber(ComplexNumber other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiplyComplexNumber(ComplexNumber other) {
        double newRealPart = (this.realPart * other.realPart) - (this.imaginaryPart * other.imaginaryPart);
        double newImaginaryPart = (this.realPart * other.imaginaryPart) + (this.imaginaryPart * other.realPart);
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }
}