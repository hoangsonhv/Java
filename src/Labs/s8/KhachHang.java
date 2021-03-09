package Labs.s8;

import java.util.Scanner;

public abstract class KhachHang {
    protected int maKh;
    protected String hoTen;
    protected String ngayRaHD;
    protected int soLuong;

    public KhachHang() {
    }

    public KhachHang(int maKh, String hoTen, String ngayRaHD, int soLuong) {
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
        this.soLuong = soLuong;
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(String ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract double thanhTien();
}
