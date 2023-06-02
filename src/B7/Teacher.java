package B7;

public class Teacher {
    private String name;
    private int age;
    private String hometown;
    private String teacherID;
    private double salary;
    private double bonus;
    private double penalty;
    private double netSalary;

    public Teacher(String name, int age, String hometown, String teacherID, double salary, double bonus, double penalty, double netSalary) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.teacherID = teacherID;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " Name: " + name +
                ", Age: " + age +
                ", Hometown: " + hometown +
                ", Teacher's ID: " + teacherID +
                '}';
    }
}