package B12;

public class Vehicle {
    private String id;
    private String manufacturer;
    private int year;
    private double price;
    private String color;

    public Vehicle(String id, String manufacturer, int year, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getDetails() {
        return "ID: " + id + ", Manufacturer: " + manufacturer + ", Year: " + year + ", Price: " + price + ", Color: " + color;
    }
}