package Assignment.ms6;

import java.util.ArrayList;

public class LopHoc{
    public String name;
    public int soluonghocsinh;
    public ArrayList<String > danhSachHS;

    public LopHoc(String name, int soluonghocsinh){
        this.name = name;
        this.soluonghocsinh = soluonghocsinh;
        danhSachHS = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoluonghocsinh() {
        return soluonghocsinh;
    }

    public void setSoluonghocsinh(int soluonghocsinh) {
        this.soluonghocsinh = soluonghocsinh;
    }

    public void nhapHS(){
        System.out.println("Nhap Danh Sach Hoc Sinh:");
    }
}
