package B1;

public class CongNhan extends CanBo {
    private int capBac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int capBac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Cong nhan{" +
                "Cap bac:" + capBac +
                ", Ten:'" + ten +
                ", Tuoi:" + tuoi +
                ", Gioi tinh:'" + gioiTinh +
                ", Dia chi:'" + diaChi +
                '}';
    }
}
