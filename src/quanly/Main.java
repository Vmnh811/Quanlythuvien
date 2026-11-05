package quanly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tongSoLuong = 0;
        double tongGiaTri = 0;
        
        String maSachLuuTru = "";
        String tenSachLuuTru = "";
        double donGiaLuuTru = 0;
        int soLuongLuuTru = 0;
        
        int luaChon;

        do {
            System.out.println("1. Nhập danh sách sách");
            System.out.println("2. Xem tổng số lượng và tổng giá trị kho");
            System.out.println("3. Tìm kiếm sách theo mã");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số lượng sách: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); 
                    int i = 1;
                    while (i <= n) {
                        System.out.println("\nNhập thông tin cuốn sách thứ " + i + ":");
                        System.out.print("Nhập mã sách: ");
                        String maSach = scanner.nextLine();

                        System.out.print("Nhập tên sách: ");
                        String tenSach = scanner.nextLine();

                        System.out.print("Nhập đơn giá: ");
                        double donGia = scanner.nextDouble();

                        System.out.print("Nhập số lượng: ");
                        int soLuong = scanner.nextInt();
                        scanner.nextLine(); 

                        tongSoLuong += soLuong;
                        tongGiaTri += (donGia * soLuong);

                        maSachLuuTru = maSach;
                        tenSachLuuTru = tenSach;
                        donGiaLuuTru = donGia;
                        soLuongLuuTru = soLuong;

                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Tổng số lượng sách: " + tongSoLuong + " cuốn.");
                    System.out.println("Tổng giá trị sách: " + tongGiaTri + " VNĐ.");
                    break;

                case 3:
                    System.out.print("Nhập mã sách tìm kiếm: ");
                    String maTimKiem = scanner.nextLine();
                    
                    if (!maSachLuuTru.isEmpty() && maSachLuuTru.equalsIgnoreCase(maTimKiem)) {
                        System.out.println("\n Đã tìm thấy sách");
                        System.out.println("Mã sách: " + maSachLuuTru);
                        System.out.println("Tên sách: " + tenSachLuuTru);
                        System.out.println("Đơn giá: " + donGiaLuuTru + " VNĐ.");
                        System.out.println("Số lượng: " + soLuongLuuTru + " cuốn.");
                    } else {
                        System.out.println("\nChưa tìm thấy sách.");
                    }
                    break;

                case 4:
                    System.out.println("Thoát");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                    break;
            }
        } while (luaChon != 4);

        scanner.close();
    }
}
