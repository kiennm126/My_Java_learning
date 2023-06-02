package B13.Entities;

import java.util.List;

public class Intern extends Employee {
    private String major;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, int semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String employeeID, String fullName, String birthday, String phoneNum, String eMail, List<Certificate> certificates, String major, int semester, String universityName) {
        super(employeeID, fullName, birthday, phoneNum, eMail, certificates);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showEmployeeInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Intern{" +
                " Employee ID: " + employeeID +
                ", Full-name: " + fullName +
                ", Birthday: " + birthday +
                ", Phone number: " + phoneNum +
                ", E-mail: " + eMail +
                " " + certificates +
                ", Major: " + major +
                ", Semester: " + semester +
                ", University name: " + universityName +
                "}";
    }
}