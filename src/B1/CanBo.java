package B1;

public class CanBo {
    protected String ten;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo(String ten, int tuoi, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {

        return ten;
    }

    public void setTen(String ten) {

        this.ten = ten;
    }

    public int getTuoi() {

        return tuoi;
    }

    public void setTuoi(int tuoi) {

        this.tuoi = tuoi;
    }

    public String getGioiTinh() {

        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {

        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {

        return diaChi;
    }

    public void setDiaChi(String diaChi) {

        this.diaChi = diaChi;
    }
}