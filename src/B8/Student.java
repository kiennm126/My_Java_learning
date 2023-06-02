package B8;

public class Student {
    private String name;
    private int age;
    private String classOfStudent;

    public Student(String name, int age, String classOfStudent) {
        this.name = name;
        this.age = age;
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
                ", Class of student: " + classOfStudent +
                '}';
    }
}