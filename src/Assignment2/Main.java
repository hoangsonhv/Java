package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Fraction ps = new Fraction();
        ps.setTuSo(1);
        ps.setMauSo(2);
        Fraction ps1 = new Fraction();
        ps1.setTuSo(1);
        ps1.setMauSo(3);


        Fraction t = ps.add(ps1);
        t.printFraction();
    }
}