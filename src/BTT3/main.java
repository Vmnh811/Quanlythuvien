package BTT3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	// Bài 1
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

        // Bài 2
        double thanhTien = donGia * soLuong;

        // Bài 3:
        double phiVanChuyen = 0.05 * thanhTien;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển ---
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Bài 1: Hiển thị lại
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền : " + thanhTien);
        System.out.println("Phí vận chuyển : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập : " + tongTienNhap);

        scanner.close();
    }
}
