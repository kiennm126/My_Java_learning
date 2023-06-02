package B2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> taiLieu;

    public QuanLyTaiLieu() {
        this.taiLieu = new ArrayList<>();
    }

    public void themTaiLieu(TaiLieu taiLieu) {
        this.taiLieu.add(taiLieu);
    }

    public boolean xoaTaiLieu(String maTaiLieu) {
        TaiLieu doc = this.taiLieu.stream()
                .filter(document -> document.getMaTaiLieu().equals(maTaiLieu))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.taiLieu.remove(doc);
        return true;
    }

    public void showInforTaiLieu() {
        this.taiLieu.forEach(documents -> System.out.println(documents.toString()));
    }

    public void timSach() {
        timTheoLoaiTaiLieu(Sach.class);
    }

    public void timTapChi() {
        timTheoLoaiTaiLieu(TapChi.class);
    }

    public void timBao() {
        timTheoLoaiTaiLieu(Bao.class);
    }

    private void timTheoLoaiTaiLieu(Class<?> loaiTaiLieu) {
        this.taiLieu.stream()
                .filter(loaiTaiLieu::isInstance)
                .forEach(System.out::println);
    }
}