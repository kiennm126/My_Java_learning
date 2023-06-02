package B13.Entities;

import java.util.List;

public class Fresher extends Employee {

    private String graduationDate;
    private String graduationRank;
    private String universityName;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String universityName) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public Fresher(String employeeID, String fullName, String birthday, String phoneNum, String eMail, List<Certificate> certificates, String graduationDate, String graduationRank, String universityName) {
        super(employeeID, fullName, birthday, phoneNum, eMail, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return universityName;
    }

    public void setEducation(String education) {
        this.universityName = education;
    }

    @Override
    public void showEmployeeInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                " Employee ID: " + employeeID +
                ", Full-name: " + fullName +
                ", Birthday: " + birthday +
                ", Phone number: " + phoneNum +
                ", E-mail: " + eMail +
                " " + certificates +
                ", Graduation date: " + graduationDate +
                ", Graduation rank: " + graduationRank +
                ", University name: " + universityName +
                "}";
    }
}