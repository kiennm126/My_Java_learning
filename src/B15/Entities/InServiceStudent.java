package B15.Entities;

import java.util.List;

public class InServiceStudent extends Student {
    private String trainingAssociation;

    public InServiceStudent(String studentID, String fullName, String dateOfBirth, int yearOfEntry, double entryPoints, AcademicResult academicResult, String trainingAssociation) {
        super(studentID, fullName, dateOfBirth, yearOfEntry, entryPoints, academicResult);
        this.trainingAssociation = trainingAssociation;
    }

    public String getTrainingAssociation() {
        return trainingAssociation;
    }
}
