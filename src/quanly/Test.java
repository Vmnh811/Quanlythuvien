package quanly;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Sach1 s1 = new Sach1("S01", "Lập trình Java nâng cao", "Nguyễn Văn A", 2024, 15);
        Sach1 s2 = new Sach1();
        s2.setMaSach("S02");
        s2.setTieuDe("Trí tuệ nhân tạo");
        s2.setTacGia("Trần Thị B");
        s2.setNamXuatBan(2030); 
        s2.setSoLuong(-10);  
        s2.setNamXuatBan(2025);
        s2.setSoLuong(8);
        ArrayList<Sach1> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(s2);

        System.out.println("DANH SÁCH");
        for (Sach1 s : danhSach) {
            s.hienThiThongTin();
        }
    }
}
