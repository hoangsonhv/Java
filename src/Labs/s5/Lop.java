package Labs.s5;

import java.util.Scanner;

public class Lop {
    public String tenLop;
    public int soHs;

    public Lop() {
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSoHs() {
        return soHs;
    }

    public void setSoHs(int soHs) {
        this.soHs = soHs;
    }

    public void nhaptt(){
        Scanner a = new Scanner(System.in);
        System.out.println("Tên Lớp: ");
        setTenLop(a.nextLine());
        System.out.println("Số Học Sinh: ");
        setSoHs(a.nextInt());
    }
}
