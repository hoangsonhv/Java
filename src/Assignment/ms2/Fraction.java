package Assignment.ms2;

import java.util.Scanner;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo!=0?mauSo:1;
    }

    public void inputFraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        setTuSo(sc.nextInt());
        System.out.println("Nhap mau so:");
        setMauSo(sc.nextInt());
    }

    public void printFraction(){
        System.out.println("Phan so: "+getTuSo()+"/"+getMauSo());
    }

    public void rutGon(){
        // tim UCLN cua tu so va mau so
        int ucln = timUCLN();
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public int timUCLN(){
        for (int i=Math.min(getTuSo(),getMauSo());i>0;i--){
            if(getTuSo()%i==0&&getMauSo()%i==0) return i;
        }
        return 1;
    }

    public void nghichDao(){
        int ms = getMauSo();
        if(getTuSo()!=0){
            setMauSo(getTuSo());
            setTuSo(ms);
        }else {
            System.out.println("Khong the nghich dao");
        }
    }

    public Assignment2.Fraction add(Assignment2.Fraction ps){
        int ms = this.getMauSo() * ps.getMauSo();
        int ts = this.getTuSo()*ps.getMauSo() + ps.getTuSo()*this.getMauSo();
        Assignment2.Fraction tong = new Assignment2.Fraction();
        tong.setTuSo(ts);
        tong.setMauSo(ms);
        tong.rutGon();
        return tong;
    }

    public Assignment2.Fraction sub(Assignment2.Fraction ps){
        int ms = this.getMauSo()*ps.getMauSo();
        int ts = this.getTuSo()*ps.getMauSo() - ps.getTuSo()*this.getMauSo();
        Assignment2.Fraction hieu = new Assignment2.Fraction();
        hieu.setTuSo(ts);
        hieu.setMauSo(ms);
        hieu.rutGon();
        return hieu;
    }

    public Assignment2.Fraction mul(Assignment2.Fraction ps){
        int ts = this.getTuSo()*ps.getTuSo();
        int ms = this.getMauSo()*ps.getMauSo();
        Assignment2.Fraction tich = new Assignment2.Fraction();
        tich.setTuSo(ts);
        tich.setMauSo(ms);
        tich.rutGon();
        return tich;
    }

    public Assignment2.Fraction div(Assignment2.Fraction ps){
        Assignment2.Fraction thuong = new Assignment2.Fraction();
        thuong.setTuSo(this.getTuSo()*ps.getMauSo());
        thuong.setMauSo(this.getMauSo()*ps.getTuSo());
        thuong.rutGon();
        return thuong;
    }

}
