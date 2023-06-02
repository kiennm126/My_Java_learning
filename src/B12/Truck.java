package B12;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String id, String manufacturer, int year, double price, String color, double tonnage) {
        super(id, manufacturer, year, price, color);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    @Override
    public String getDetails() {
        System.out.println("Truck:");
        return super.getDetails() + ", Tonnage: " + tonnage;
    }
}