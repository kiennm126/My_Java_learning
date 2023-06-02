package B5;

public class RoomB extends Room{
    public RoomB(){
        super("B", 300);
    }

    @Override
    public String toString() {
        return "RoomB{" +
                " Type: " + type +
                ", Price: " + price +
                "}";
    }
}