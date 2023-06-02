package B4;

import java.util.List;

public class Family {
    private List<Person> people;
    private String address;

    public Family(List<Person> people, String address) {
        this.people = people;
        this.address = address;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "People= " + people +
                ", Address: " + address +
                '}';
    }
}