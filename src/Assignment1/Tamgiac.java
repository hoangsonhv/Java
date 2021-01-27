package Assignment1;

public class Tamgiac {
    int c1,c2,c3;

    void TamGiac() {
        System.out.println("Cạnh thứ nhất:  " + c1);
        System.out.println("Cạnh thứ hai :  " + c2);
        System.out.println("Cạnh thứ ba  :  " + c3);
    }
    boolean checkStock() {
        if ((c1 + c2 > c3) && (c1 + c3 > c2) && (c2 + c3 > c1)) return true;
        return false;
    }
    Double Chuvi(){
        double cv=0;
        cv = c1 + c2 + c3;
        return cv;
    }
    Double DienTich(){
        double s;
        float p;
        p = (float)(c1+c2+c3)/2;
        s = (float)Math.sqrt(p*(p-c1)*(p-c2)*(p-c3));
        return s;
    }
}
