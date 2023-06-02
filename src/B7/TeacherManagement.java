package B7;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
    private List<Teacher> teachers;

    public TeacherManagement() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public boolean removeTeacherById(String id) {
        Teacher teacher = this.teachers.stream()
                                       .filter(a -> a.getTeacherID().equals(id))
                                       .findFirst()
                                       .orElse(null);
        if (teacher == null) {
            return false;
        }
        this.teachers.remove(teacher);
        return true;
    }

    public double calculateNetSalary(String id) {
        Teacher teacher = this.teachers.stream()
                                       .filter(a -> a.getTeacherID().equals(id))
                                       .findFirst()
                                       .orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getSalary() + teacher.getBonus() + teacher.getPenalty();
    }

    public void showCustomerList() {
        this.teachers.forEach(p -> System.out.println(p.toString()));
    }
}