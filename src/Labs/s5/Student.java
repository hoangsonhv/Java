package Labs.s5;

import java.util.Scanner;

public class Student extends Person {
    private int maSv;
    private double diemThi;
    private String email;

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputPerson(){
        Scanner p = new Scanner(System.in);
        System.out.println("Nhap Ho Ten: ");
        setName(p.nextLine());
        System.out.println("Nhap Gioi Tinh: ");
        setGender(p.nextLine());
        System.out.println("Nhap Ngay Sinh: ");
        setDate(p.nextLine());
        System.out.println("Nhap Dia Chi: ");
        setAddress(p.nextLine());
        System.out.println("Nhap Ma SV: ");
        setMaSv(p.nextInt());
        System.out.println("Nhap Diem Thi: ");
        setDiemThi(p.nextDouble());
        System.out.println("Nhap Email: ");
        setEmail(p.next());
        System.out.println();
    }

    public void printPerson(){
        System.out.println("Ho Ten La: "+getName());
        System.out.println("Co Gioi Tinh: : "+getGender());
        System.out.println("Ngay Sinh La: "+getDate());
        System.out.println("Dia Chi La: "+getAddress());
        System.out.println("Ma SV La: "+getMaSv());
        System.out.println("Diem Thi La: "+getDiemThi());
        System.out.println("Dia Chi Email La: "+getEmail());
        System.out.println();
    }

    public boolean checkDT(){
        if(diemThi>8.0){
            System.out.println("Du dieu kien nhan hoc bong.");
            return true;
        }
        System.out.println("Khong du dieu kien nhan hoc bong.");
        return false;
    }
}
