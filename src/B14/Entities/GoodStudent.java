package B14.Entities;

public class GoodStudent extends GraduatedStudent {
    private double gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String gender, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, gender, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    @Override
    public void ShowMyInfo() {
        super.ShowMyInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Best Reward: " + bestRewardName);
        System.out.println();
    }
}