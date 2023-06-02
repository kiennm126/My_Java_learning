package B6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Student> oneClass;

    public School() {
        this.oneClass = new ArrayList<>();
    }

    public void addNewStudent(Student student) {
        this.oneClass.add(student);
    }

    public List<Student> get20YearOldStudents() {
        return this.oneClass.stream()
                            .filter(student -> student.getAge() == 20)
                            .collect(Collectors.toList());
    }

    public long count23YearOldStudentsInDN() {
        return this.oneClass.stream()
                            .filter(student -> student.getAge() == 23 && student.getHometown().equals("DN"))
                            .count();
    }
}