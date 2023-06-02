package B9;

public class Customer {
    private String fullName;
    private String houseNumber;
    private String meterCode;
    private Bill bill;

    public Customer(String fullName, String houseNumber, String meterCode, Bill bill) {
        this.fullName = fullName;
        this.houseNumber = houseNumber;
        this.meterCode = meterCode;
        this.bill = bill;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " Full name: " + fullName +
                ", House number: " + houseNumber +
                ", Meter code: " + meterCode +
                ", " + bill +
                '}';
    }
}