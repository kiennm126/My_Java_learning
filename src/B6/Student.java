package B6;

public class Student {
    private String name;
    private int age;
    private String hometown;
    private String classOfStudent;

    public Student(String name, int age, String hometown, String classOfStudent) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.classOfStudent = classOfStudent;
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

    public void setHometown(String homeTown) {
        this.hometown = homeTown;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                " Name: " + name +
                ", Age: " + age +
                ", Hometown: " + hometown +
                ", Class: " + classOfStudent +
                '}';
    }
}