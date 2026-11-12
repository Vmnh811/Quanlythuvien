package quanly;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Sach1 s1 = new Sach1("S01", "Lập trình Java cơ bản", "Nguyễn Văn A", 2024, 15);
        Sach1 s2 = new Sach1("S02", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B", 2023, 10);
        
        Sach1 s3 = new Sach1();
        s3.setMaSach("S03");
        s3.setTieuDe("Cơ sở dữ liệu SQL");
        s3.setTacGia("Lê Văn C");
        s3.setNamXuatBan(2025);
        s3.setSoLuong(20);

        ArrayList<Sach1> danhSachSach = new ArrayList<>();
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        System.out.println("Danh sách ");
        for (Sach1 s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}
