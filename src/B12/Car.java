package B12;

public class Car extends Vehicle {
    private int numSeats;
    private String engineType;

    public Car(String id, String manufacturer, int year, double price, String color, int numSeats, String engineType) {
        super(id, manufacturer, year, price, color);
        this.numSeats = numSeats;
        this.engineType = engineType;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String getDetails() {
        System.out.println("Car:");
        return super.getDetails() + ", Number of Seats: " + numSeats + ", Engine Type: " + engineType;
    }
}