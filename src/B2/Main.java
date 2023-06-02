package B2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        while (true) {
            System.out.println("Chuong trinh quan ly tai lieu thu vien");
            System.out.println("--------------------------------------");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu theo ma tai lieu ");
            System.out.println("3. Hien thi thong tin ve tai lieu");
            System.out.println("4. Tim kiem tai lieu theo loai: Sach, Tap chi, Bao");
            System.out.println("5. Thoat khoi chuong trinh");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("A. Them moi sach");
                    System.out.println("B. Them moi tap chi");
                    System.out.println("C. Them moi bao");
                    String loai = scanner.nextLine();
                    switch (loai) {
                        case "A": {
                            TaiLieu sach = createTaiLieu(scanner, "Sach");
                            quanLyTaiLieu.themTaiLieu(sach);
                            System.out.println(sach != null ? sach.toString() : null);

                            break;

                        }
                        case "B": {
                            TaiLieu tapChi = createTaiLieu(scanner, "TapChi");
                            quanLyTaiLieu.themTaiLieu(tapChi);
                            System.out.println(tapChi != null ? tapChi.toString() : null);
                            scanner.nextLine();
                            break;
                        }
                        case "C": {
                            TaiLieu bao = createTaiLieu(scanner, "Bao");
                            quanLyTaiLieu.themTaiLieu(bao);
                            System.out.println(bao != null ? bao.toString() : null);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ma tai lieu de xoa tai lieu tuong ung: ");
                    String id = scanner.nextLine();
                    System.out.println(quanLyTaiLieu.xoaTaiLieu(id) ? "Xoa thanh cong!" : "Xoa that bai.");
                    break;
                }
                case "3": {
                    quanLyTaiLieu.showInforTaiLieu();
                    break;
                }
                case "4": {
                    System.out.println("a. Tim sach ");
                    System.out.println("b. Tim tap chi");
                    System.out.println("c. Tim bao");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            quanLyTaiLieu.timSach();
                            break;
                        }
                        case "b": {
                            quanLyTaiLieu.timTapChi();
                            break;
                        }
                        case "c":
                            quanLyTaiLieu.timBao();
                            break;
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Khong hop le");
            }
        }
    }

    private static TaiLieu createTaiLieu(Scanner scanner, String type) {
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case "Sach": {
                System.out.print("Nhap ten tac gia: ");
                String tenTacGia = scanner.nextLine();
                System.out.print("Nhap so trang: ");
                int soTrang = scanner.nextInt();
                scanner.nextLine();
                return new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
            }
            case "TapChi": {
                System.out.print("Nhap so phat hanh: ");
                int soPhatHanh = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhap thang phat hanh: ");
                int thangPhatHanh = scanner.nextInt();
                scanner.nextLine();
                return new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
            }
            case "Bao": {
                System.out.print("Nhap ngay phat hanh: ");
                int ngayPhatHanh = scanner.nextInt();
                scanner.nextLine();
                return new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
            }
            default:
                return null;
        }
    }
}