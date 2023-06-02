package B13.Entities;

import java.util.List;

public abstract class Employee {
    protected String employeeID;
    protected String fullName;
    protected String birthday;
    protected String phoneNum;
    protected String eMail;
    protected List<Certificate> certificates;

    public Employee() {
    }

    public Employee(String employeeID, String fullName, String birthday, String phoneNum, String eMail, List<Certificate> certificates) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
        this.certificates = certificates;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showEmployeeInfor();
}