package Labs.s4_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.setMaso(1);
        sv.setHoten("Hoang Van Son");
        sv.setSdt(968555197);
        sv.setDiachi("Ngo 207,Xuan Dinh,HN");

        SinhVien sv2 = new SinhVien();
        sv2.setMaso(2);
        sv2.setHoten("Dang Quoc Dat");
        sv2.setSdt(1122334455);
        sv2.setDiachi("So 1,Tran Duy Hung,HN");

        LopHoc lh = new LopHoc();
        lh.setMalop(123);
        lh.setTenlop("T2008M");
        lh.setPhonghoc("Phong A8");
        lh.addSv(sv);
        lh.addSv(sv);
        lh.addSv(sv2);
        lh.addSv(sv2);
        lh.removeSV(sv);

        lh.printDS();
        System.out.println("Danh Sach Lop Hoc: "+"\n");
        for (SinhVien s : lh.getListSV()){
            System.out.println("Ma So: "+s.getMaso()+"\n"+"Ho Ten: "+s.getHoten()+"\n"+"SDT: "+s.getSdt()+"\n"+"Dia Chi: "+s.getDiachi()+"\n");
        }
    }
}
