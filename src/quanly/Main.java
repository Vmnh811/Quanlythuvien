package quanly;

import java.util.ArrayList;
import java.util.Scanner;
class Sach {
    String maSach;
    String tenSach;
    double donGia;
    int soLuong;
    public Sach(String maSach, String tenSach, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] soLuongArray = new int[5];
        ArrayList<String> maSachList = new ArrayList<>();
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int luaChon;
        do {
            System.out.println("1. nhập số lượng và tìm số lượng lớn nhất");
            System.out.println("2. Nhập danh sách n sách mới");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("6. Sửa sách theo mã");
            System.out.println("7. Tính tổng số lượng & tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập một số từ 1 đến 8: ");
                scanner.next();
            }
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    int tongArray = 0;
                    int maxArray = Integer.MIN_VALUE;
                    System.out.println("Nhập số lượng cho 5 cuốn sách:");
                    for (int k = 0; k < 5; k++) {
                        System.out.print("Số lượng cuốn thứ " + (k + 1) + ": ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                            scanner.next();
                        }
                        soLuongArray[k] = scanner.nextInt();
                        tongArray += soLuongArray[k];
                        if (soLuongArray[k] > maxArray) {
                            maxArray = soLuongArray[k];
                        }
                    }
                    scanner.nextLine();
                    System.out.print("Mảng số lượng vừa nhập: ");
                    for (int sl : soLuongArray) {
                        System.out.print(sl + " ");
                    }
                    System.out.println("\nTổng số lượng của mảng: " + tongArray);
                    System.out.println("Số lượng lớn nhất trong mảng: " + maxArray);
                    break;

                case 2:
                    System.out.print("Nhập số lượng cuốn sách muốn thêm (n): ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                        scanner.next();
                    }
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("\nNhập thông tin cuốn sách thứ " + i + ":");
                        System.out.print("Nhập mã sách: ");
                        String maSach = scanner.nextLine();
                        System.out.print("Nhập tên sách: ");
                        String tenSach = scanner.nextLine();
                        System.out.print("Nhập đơn giá: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Vui lòng nhập đơn giá hợp lệ: ");
                            scanner.next();
                        }
                        double donGia = scanner.nextDouble();
                        System.out.print("Nhập số lượng: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Vui lòng nhập số lượng hợp lệ: ");
                            scanner.next();
                        }
                        int soLuong = scanner.nextInt();
                        scanner.nextLine();
                        maSachList.add(maSach);
                        danhSachSach.add(new Sach(maSach, tenSach, donGia, soLuong));
                    }
                    System.out.println("Đã thêm " + n + " cuốn sách");
                    break;

                case 3:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("danh sách trống");
                    } else {
                        for (Sach s : danhSachSach) {
                            System.out.println("Mã: " + s.maSach + " | Tên: " + s.tenSach + " | Đơn giá: " + s.donGia + " | Số lượng: " + s.soLuong);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = scanner.nextLine();
                    int viTriTim = maSachList.indexOf(maTim);
                    if (viTriTim != -1) {
                        Sach s = danhSachSach.get(viTriTim);
                        System.out.println("Đã tìm thấy sách:");
                        System.out.println("Mã: " + s.maSach + " | Tên: " + s.tenSach + " | Đơn giá: " + s.donGia + " | Số lượng: " + s.soLuong);
                    } else {
                        System.out.println("Không tìm thấy mã sách này");
                    }
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = scanner.nextLine();
                    int viTriXoa = maSachList.indexOf(maXoa);
                    if (viTriXoa != -1) {
                        maSachList.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);
                        System.out.println("Đã xoá");
                    } else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = scanner.nextLine();
                    int viTriSua = maSachList.indexOf(maSua);
                    if (viTriSua != -1) {
                        System.out.print("Nhập tên sách mới: ");
                        String tenMoi = scanner.nextLine();
                        System.out.print("Nhập đơn giá mới: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Vui lòng nhập số tiền hợp lệ: ");
                            scanner.next();
                        }
                        double donGiaMoi = scanner.nextDouble();
                        System.out.print("Nhập số lượng mới: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Vui lòng nhập số lượng hợp lệ: ");
                            scanner.next();
                        }
                        int soLuongMoi = scanner.nextInt();
                        scanner.nextLine();

                        Sach s = danhSachSach.get(viTriSua);
                        s.tenSach = tenMoi;
                        s.donGia = donGiaMoi;
                        s.soLuong = soLuongMoi;
                        System.out.println("Đã cập nhật");
                    } else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;

                case 7:
                    int tongSL = 0;
                    double tongGT = 0;
                    for (Sach s : danhSachSach) {
                        tongSL += s.soLuong;
                        tongGT += (s.soLuong * s.donGia);
                    }
                    System.out.println("Tổng số lượng sách trong kho: " + tongSL);
                    System.out.println("Tổng giá trị kho sách: " + tongGT + " VNĐ.");
                    break;

                case 8:
                    System.out.println("Thoát");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (luaChon != 8);

        scanner.close();
    }
}
