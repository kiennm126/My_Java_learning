package B9;

public class Bill {
    private double oldIndex;
    private double newIndex;
    private double payment;

    public Bill(double oldIndex, double newIndex, double payment) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.payment = payment;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Bill{" +
                ", Old index: " + oldIndex +
                ", New index: " + newIndex +
                '}';
    }
}