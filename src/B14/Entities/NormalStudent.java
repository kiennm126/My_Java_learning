package B14.Entities;

public class NormalStudent extends GraduatedStudent {
    private int toeicScore;
    private double entryTestScore;

    public NormalStudent(String fullName, String doB, String gender, String phoneNumber, String universityName, String gradeLevel, int toeicScore, double entryTestScore) {
        super(fullName, doB, gender, phoneNumber, universityName, gradeLevel);
        this.toeicScore = toeicScore;
        this.entryTestScore = entryTestScore;
    }

    public int getToeicScore() {
        return toeicScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    @Override
    public void ShowMyInfo() {
        super.ShowMyInfo();
        System.out.println("TOEIC Score: " + toeicScore);
        System.out.println("Entry Test Score: " + entryTestScore);
        System.out.println();
    }
}