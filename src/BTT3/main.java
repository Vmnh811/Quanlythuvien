package BTT3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        // --- Bài 1
        boolean hopLe = (donGia > 0) && (soLuong >= 0) && (namXuatBan > 0 && namXuatBan <= 2026);
        // --- Bài 2
        String phanLoaiGia = "";
        if (donGia < 50000) {
            phanLoaiGia = "Sách giá thấp";
        } else if (donGia >= 50000 && donGia <= 100000) {
            phanLoaiGia = "Sách giá trung bình";
        } else if (donGia > 100000 && donGia <= 200000) {
            phanLoaiGia = "Sách giá cao";
        } else {
            phanLoaiGia = "Sách giá đặc biệt";
        }
        // --- Bài 3
        String phanLoaiTonKho = "";
        if (soLuong == 0) {
            phanLoaiTonKho = "Hết sách";
        } else if (soLuong >= 1 && soLuong <= 5) {
            phanLoaiTonKho = "Sắp hết";
        } else if (soLuong >= 6 && soLuong <= 20) {
            phanLoaiTonKho = "Còn ít";
        } else {
            phanLoaiTonKho = "Còn nhiều";
        }
        // --- Bài 4
        System.out.println("\n CHỌN THỂ LOẠI SÁCH");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("lựa chọn: ");
        int luaChon = scanner.nextInt();
        String loaiSach = "";
        switch (luaChon) {
            case 1:
                loaiSach = "Sách giáo khoa";
                break;
            case 2:
                loaiSach = "Sách tham khảo";
                break;
            case 3:
                loaiSach = "Sách chuyên ngành";
                break;
            case 4:
                loaiSach = "Sách khác";
                break;
            default:
                loaiSach = "Lựa chọn không hợp lệ";
                break;
        }
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Bài 1: " + (hopLe ? "Đ" : "S"));
        System.out.println("Bài 2: " + phanLoaiGia);
        System.out.println("Bài 3: " + phanLoaiTonKho);
        System.out.println("Bài 4: " + loaiSach);

        scanner.close();
    }
}
