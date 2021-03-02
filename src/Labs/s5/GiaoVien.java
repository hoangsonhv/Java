package Labs.s5;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person{
    private ArrayList<String  > dsLop;
    private int mucLuong;
    private int soMon;
    private String cacMon;

    public GiaoVien() {
        dsLop = new ArrayList<String >();
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    public String getCacMon() {
        return cacMon;
    }

    public void setCacMon(String cacMon) {
        this.cacMon = cacMon;
    }

//    public ArrayList<String > getDsLop(){
//        return dsLop;
//    }
    public void addLop(String lp){
        dsLop.add(lp);
    }

    public void inputPerson(){
        super.inputPerson();
        Scanner p = new Scanner(System.in);
        System.out.println("Muc Luong: ");
        setMucLuong(p.nextInt());
        System.out.println("So Mon Giang Day: ");
        setSoMon(p.nextInt());
        p.nextLine();
        System.out.println("Danh Sách Các Môn: ");
        setCacMon(p.nextLine());
        System.out.println();
    }

    public void printPerson(){
        super.printPerson();
        for (String i:dsLop){
            System.out.println("Lớp: "+i);
        }
        System.out.println("Muc Luong: "+getMucLuong());
        System.out.println("So Mon Giang Day: "+getSoMon());
        System.out.println("Các Môn Giảng Dạy Là: "+getCacMon());
        System.out.println();
    }
}
