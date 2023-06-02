package B4;

public class Person {
    private String name;
    private int age;
    private String job;
    private String idCardNumber;

    public Person(String name, int age, String job, String idCardNumber) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.idCardNumber = idCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name: " + name +
                ", Age: " + age +
                ", Job: " + job +
                ", ID card number: " + idCardNumber +
                "}";
    }
}