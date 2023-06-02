package B1;

public class KySu extends CanBo {
    private String nganhDaoTao;
    public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Ky su{" +
                "Nganh dao tao:" + nganhDaoTao +
                ", Ten:" + ten +
                ", Tuoi:" + tuoi +
                ", Gioi tinh:" + gioiTinh +
                ", Dia chi:" + diaChi +
                '}';
    }
}