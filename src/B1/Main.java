package B1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("Chuong trinh quan li can bo");
            System.out.println("----------------------------");
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem can bo theo ten ");
            System.out.println("3. Hien thi danh sach thong tin can bo");
            System.out.println("4. Thoat chuong trinh");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a. Nhap ky su");
                    System.out.println("b. Nhap cong nhan");
                    System.out.println("c. Nhap nhan vien");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            CanBo kySu = createCanBo(scanner, "KySu");
                            qlcb.themCanBo(kySu);
                            System.out.println(kySu);
                            break;

                        }
                        case "b": {
                            CanBo congNhan = createCanBo(scanner, "CongNhan");
                            qlcb.themCanBo(congNhan);
                            System.out.println(congNhan);
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            CanBo nhanVien = createCanBo(scanner, "NhanVien");
                            qlcb.themCanBo(nhanVien);
                            System.out.println(nhanVien);
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ten can bo muon tim kiem: ");
                    String ten = scanner.nextLine();
                    qlcb.timCanBoTheoTen(ten).forEach(System.out::println);
                    break;
                }
                case "3": {
                    qlcb.showListInforCanBo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le");
            }
        }
    }

    private static CanBo createCanBo(Scanner scanner, String type) {
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        switch (type) {
            case "KySu": {
                System.out.print("Nhap nganh dao tao: ");
                String nganhDaoTao = scanner.nextLine();
                return new KySu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
            }
            case "CongNhan": {
                System.out.print("Nhap cap bac: ");
                int capBac = scanner.nextInt();
                scanner.nextLine();
                return new CongNhan(ten, tuoi, gioiTinh, diaChi, capBac);
            }
            case "NhanVien": {
                System.out.print("Nhap cong viec: ");
                String congViec = scanner.nextLine();
                return new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
            }
            default:
                return null;
        }
    }
}