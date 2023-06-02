package B2;

public class Sach extends TaiLieu {

    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "Ma tai lieu: " + maTaiLieu +
                ", Ten nha xuat ban: " + tenNhaXuatBan +
                ", So ban phat hanh: " + soBanPhatHanh +
                ", Ten tac gia: " + tenTacGia +
                ", So trang: " + soTrang +
                '}';
    }
}