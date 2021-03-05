package Assignment.ms6;

import java.util.ArrayList;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc {
    public ArrayList<LopHoc > danhSachLopHoc;

    public MonHocDaiCuong(){
        danhSachLopHoc = new ArrayList<>();
    }

    @Override
    public void themLopHoc(String name, int soluonghocsinh) {
        for(LopHoc p:danhSachLopHoc){
            if(p.getName().equals(name)){
                return;
            }
        }
        LopHoc p = new LopHoc(name,soluonghocsinh);
        danhSachLopHoc.add(p);
    }

    @Override
    public void xoaLopHoc(String name) {
        for(LopHoc p:danhSachLopHoc){
            if(p.getName().equals(name)){
                danhSachLopHoc.remove(p);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        danhSachLopHoc.sort(new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void inDanhSach() {
        for(LopHoc p :danhSachLopHoc){
            System.out.println("Tên Lớp: "+p.getName()+"-"+"Số Học Sinh: "+p.getSoluonghocsinh());
        }
    }
}
