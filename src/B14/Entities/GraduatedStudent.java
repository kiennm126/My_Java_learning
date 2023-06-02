package B14.Entities;

public class GraduatedStudent {
    protected String fullName;
    protected String doB;
    protected String gender;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    public GraduatedStudent(String fullName, String doB, String gender, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void ShowMyInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("University Name: " + universityName);
        System.out.println("Grade Level: " + gradeLevel);
    }
}