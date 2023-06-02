package B9;

import B7.Teacher;

import java.util.ArrayList;
import java.util.List;

public class BillManager {
    private List<Customer> customerList;

    public BillManager() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customerList.add(customer);
    }

    public boolean removeCustomer(String houseNumber) {
        Customer customer = this.customerList.stream()
                                .filter(t -> t.getHouseNumber().equals(houseNumber))
                                .findFirst()
                                .orElse(null);
        if (customer == null) {
            return false;
        }
        this.customerList.remove(customer);
        return true;
    }

    public void editCustomerInformation(String houseNumber,  String newFullName, String newMeterCode) {
        this.customerList.stream()
                .filter(customer -> customer.getHouseNumber().equals(houseNumber))
                .findFirst()
                .ifPresent(customer -> {
                    customer.setFullName(newFullName);
                    customer.setMeterCode(newMeterCode);
                    System.out.println("Customer information updated successfully.");
                });
    }

    public double calculateElectricityBill(String houseNumber) {
        Customer customer = this.customerList.stream()
                .filter(a -> a.getHouseNumber().equals(houseNumber))
                .findFirst()
                .orElse(null);
        if (customer == null) {
            return 0;
        }
        return ((customer.getBill().getNewIndex() - customer.getBill().getOldIndex()) * 5);
    }

    public void showCustomerList() {
        this.customerList.forEach(p -> System.out.println(p.toString()));
    }

}