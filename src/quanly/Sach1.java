package quanly;

import java.time.Year; 
public class Sach1 { 
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach1() {
    }
    public Sach1(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() { return tieuDe; }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {return tacGia;}

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue(); 
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản (" + namXuatBan + ") không hợp lệ" );
        }
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng (" + soLuong + ") không được là số âm");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach 
                + " | Tiêu đề: " + tieuDe 
                + " | Tác giả: " + tacGia 
                + " | Năm XB: " + namXuatBan 
                + " | Số lượng: " + soLuong);
    }
}
