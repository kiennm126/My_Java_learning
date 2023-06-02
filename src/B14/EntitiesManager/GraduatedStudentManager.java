package B14.EntitiesManager;

import B14.Entities.GoodStudent;
import B14.Entities.GraduatedStudent;
import B14.Entities.NormalStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GraduatedStudentManager {
    private List<GraduatedStudent> graduatedStudents;

    public GraduatedStudentManager() {
        graduatedStudents = new ArrayList<>();
    }

    public List<GraduatedStudent> getGraduatedStudents() {
        return graduatedStudents;
    }

    public void addStudent(GraduatedStudent student) {
        graduatedStudents.add(student);
    }

    public void showAllStudents() {
        Collections.sort(graduatedStudents, new Comparator<GraduatedStudent>() {
            @Override
            public int compare(GraduatedStudent s1, GraduatedStudent s2) {
                int nameCompare = s1.getFullName().compareTo(s2.getFullName());
                if (nameCompare != 0) {
                    return nameCompare;
                } else {
                    return s1.getPhoneNumber().compareTo(s2.getPhoneNumber());
                }
            }
        });

        for (GraduatedStudent student : graduatedStudents) {
            student.ShowMyInfo();
        }
    }

    public List<GraduatedStudent> selectCandidates(int numberOfCandidates) throws IndexOutOfBoundsException {
        List<GoodStudent> goodStudents = new ArrayList<>();
        List<NormalStudent> normalStudents = new ArrayList<>();
        List<GraduatedStudent> selectedCandidates = new ArrayList<>();

        for (GraduatedStudent student : graduatedStudents) {
            if (student instanceof GoodStudent) {
                goodStudents.add((GoodStudent) student);
            } else if (student instanceof NormalStudent) {
                normalStudents.add((NormalStudent) student);
            }
        }

        if (goodStudents.size() >= numberOfCandidates) {
            Collections.sort(goodStudents, new Comparator<GoodStudent>() {
                @Override
                public int compare(GoodStudent s1, GoodStudent s2) {
                    if (s1.getGpa() != s2.getGpa()) {
                        return Double.compare(s2.getGpa(), s1.getGpa());
                    } else {
                        return s1.getFullName().compareTo(s2.getFullName());
                    }
                }
            });

            selectedCandidates.addAll(goodStudents.subList(0, numberOfCandidates));
        } else {
            selectedCandidates.addAll(goodStudents);

            int remainingCandidates = numberOfCandidates - selectedCandidates.size();
            Collections.sort(normalStudents, new Comparator<NormalStudent>() {
                @Override
                public int compare(NormalStudent s1, NormalStudent s2) {
                    if (s1.getEntryTestScore() != s2.getEntryTestScore()) {
                        return Double.compare(s2.getEntryTestScore(), s1.getEntryTestScore());
                    } else if (s1.getToeicScore() != s2.getToeicScore()) {
                        return Integer.compare(s2.getToeicScore(), s1.getToeicScore());
                    } else {
                        return s1.getFullName().compareTo(s2.getFullName());
                    }
                }
            });

            selectedCandidates.addAll(normalStudents.subList(0, remainingCandidates));
        }

        return selectedCandidates;
    }

    public int countCandidates() {
        return graduatedStudents.size();
    }

    public void deleteStudent(GraduatedStudent student) {
        graduatedStudents.remove(student);
    }
}