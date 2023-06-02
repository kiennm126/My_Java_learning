package B12;

public class Motorcycle extends Vehicle {
    private int power;

    public Motorcycle(String id, String manufacturer, int year, double price, String color, int power) {
        super(id, manufacturer, year, price, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String getDetails() {
        System.out.println("Motorcycle:");
        return super.getDetails() + ", Power: " + power;
    }
}