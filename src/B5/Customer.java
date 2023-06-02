package B5;

public class Customer {
    private String fullName;
    private int age;
    private String idCardNum;
    private int rentDaysNum;
    private Room room;

    public Customer(String fullName, int age, String idCardNum, int rentDaysNum, Room room) {
        this.fullName = fullName;
        this.age = age;
        this.idCardNum = idCardNum;
        this.rentDaysNum = rentDaysNum;
        this.room = room;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public int getRentDaysNum() {
        return rentDaysNum;
    }

    public void setRentDaysNum(int rentDaysNum) {
        this.rentDaysNum = rentDaysNum;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " Name: " + fullName +
                ", Age: " + age +
                ", ID card number: " + idCardNum +
                ", Number of rent days: " + rentDaysNum +
                ", Type of room: " + room.toString() +
                "}";
    }
}