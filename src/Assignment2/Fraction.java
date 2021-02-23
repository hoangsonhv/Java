package Assignment2;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class Fraction {
    // thuoc tinh
    protected int tu,mau;

    // ham tao khong doi so
    public Fraction(){
        tu = 1;
        mau = 2;
    }
    // Ham tao 2 doi so
    public Fraction(int tu,int mau){
        this.tu = tu;
        this.mau = mau;
    }

    // Setter va getter

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    // Các phương thức.

    public static void main(String[] args) {
        //Nhap phan so
        Scanner in = new Scanner(System.in);
        int tu,mau;
        System.out.print("Nhap tu so: ");
        tu = in.nextInt();

        System.out.print("Nhap mau so: ");
        mau = in.nextInt();

        //In phan so
        System.out.println("Phan so vua nhap la:" + tu + "/" + mau);
        Fraction phanSo1=new Fraction(tu,mau);
    }

    //Rút gọn phân số
    public int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void rutGonPhanSo() {
        int i = timUCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    //Nghich dao phan so
    public void NghichDao() {
        int tmp;
        tmp = tu;
        tu = mau;
        mau = tmp;
    }

    public void congPhanSo(Fraction ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.rutGonPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void truPhanSo(Fraction ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.rutGonPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void nhanPhanSo(Fraction ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.rutGonPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    public void chiaPhanSo(Fraction ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.rutGonPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
}
