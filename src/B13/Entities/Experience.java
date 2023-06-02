package B13.Entities;

import java.util.List;

public class Experience extends Employee {
    private int yearOfExperience;
    private String proSkill;

    public Experience(int yearOfExperience, String proSkill) {
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public Experience(String employeeID, String fullName, String birthday, String phoneNum, String eMail, List<Certificate> certificates, int yearOfExperience, String proSkill) {
        super(employeeID, fullName, birthday, phoneNum, eMail, certificates);
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showEmployeeInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{" +
                " Employee ID: " + employeeID +
                ", Full-name: " + fullName +
                ", Birthday: " + birthday +
                ", Phone number: " + phoneNum +
                ", E-mail: " + eMail +
                " " + certificates +
                ", Years of experience: " + yearOfExperience +
                ", Professional skills: " + proSkill +
                "}";
    }
}