package Assignment2;

import javax.xml.stream.FactoryConfigurationError;
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

    public Fraction add(Fraction ps){
        int ms = this.getMauSo() * ps.getMauSo();
        int ts = this.getTuSo()*ps.getMauSo() + ps.getTuSo()*this.getMauSo();
        Fraction tong = new Fraction();
        tong.setTuSo(ts);
        tong.setMauSo(ms);
        tong.rutGon();
        return tong;
    }

    public Fraction sub(Fraction ps){
        int ms = this.getMauSo()*ps.getMauSo();
        int ts = this.getTuSo()*ps.getMauSo() - ps.getTuSo()*this.getMauSo();
        Fraction hieu = new Fraction();
        hieu.setTuSo(ts);
        hieu.setMauSo(ms);
        hieu.rutGon();
        return hieu;
    }

    public Fraction mul(Fraction ps){
        int ts = this.getTuSo()*ps.getTuSo();
        int ms = this.getMauSo()*ps.getMauSo();
        Fraction tich = new Fraction();
        tich.setTuSo(ts);
        tich.setMauSo(ms);
        tich.rutGon();
        return tich;
    }

    public Fraction div(Fraction ps){
        Fraction thuong = new Fraction();
        thuong.setTuSo(this.getTuSo()*ps.getMauSo());
        thuong.setMauSo(this.getMauSo()*ps.getTuSo());
        thuong.rutGon();
        return thuong;
    }
}