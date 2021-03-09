package Labs.s8;

import java.util.Scanner;

public class KhNuocNgoai extends KhachHang {
    private String quocTich;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return getSoLuong() * 2000;
    }
}
