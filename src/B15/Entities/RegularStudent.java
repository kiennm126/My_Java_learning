package B15.Entities;

import java.util.List;

public class RegularStudent extends Student {
    public RegularStudent(String studentID, String fullName, String dateOfBirth, int yearOfEntry, double entryPoints, AcademicResult academicResult) {
        super(studentID, fullName, dateOfBirth, yearOfEntry, entryPoints, academicResult);
    }
}