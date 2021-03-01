package Labs.s4_2;

import java.util.ArrayList;

public class LopHoc {
    int malop;
    String tenlop;
    String  phonghoc;
    ArrayList<SinhVien> listSV;

    public LopHoc(){
        listSV = new ArrayList<SinhVien>();
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }

    public ArrayList<SinhVien> getListSV(){
        return listSV;
    }
    public void addSv(SinhVien ab){
        getListSV().add(ab);
    }

    public void removeSV(SinhVien ac){
        getListSV().remove(ac);
    }

    public void printDS(){
        System.out.println("Ma lop: "+getMalop());
        System.out.println("Ten lop: "+getTenlop());
        System.out.println("Phong hoc: "+getPhonghoc());
        System.out.println();
        for (SinhVien s :getListSV()){
            System.out.println("Ma So: "+s.getMaso()+"\n"+"Ho Ten: "+s.getHoten()+"\n"+"SDT: "+s.getSdt()+"\n"+"Dia Chi: "+s.getDiachi()+"\n");
        }
    }
}
