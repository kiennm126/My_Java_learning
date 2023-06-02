package B5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Customer> customers;

    public Hotel() {
        customers = new ArrayList<>();
    }

    public void addNewCustomer(Customer customer){
        this.customers.add(customer);
    }

    public boolean deleteCustomerByIDCardNum (String idCardNum){
        Customer customer = this.customers.stream()
                                          .filter(c -> c.getIdCardNum().equals(idCardNum))
                                          .findFirst()
                                          .orElse(null);
        if (customer == null){
            return false;
        } else {
            this.customers.remove(customer);
            return true;
        }
    }

    public int calculateRentalFeeByIDCardNum (String idCardNum){
        Customer customer = this.customers.stream()
                .filter(c -> c.getIdCardNum().equals(idCardNum))
                .findFirst()
                .orElse(null);
        if (customer == null){
            return 0;
        } else {
            return customer.getRoom().getPrice() * customer.getRentDaysNum();
        }
    }

    public void showCustomerList() {
        this.customers.forEach(p -> System.out.println(p.toString()));
    }
}