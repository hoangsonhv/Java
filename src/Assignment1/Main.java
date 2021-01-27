package Assignment1;

public class Main {
    public static void main(String[] args) {
        Tamgiac tg;
        tg = new Tamgiac();
        tg.c1 = 5;
        tg.c2 = 4;
        tg.c3 = 3;
        tg.TamGiac();
        if (tg.checkStock()){
            System.out.println(tg.c1 +","+ tg.c2+","+tg.c3 + " Là 3 cạnh của tam giác");
        }else{
            System.out.println(tg.c1 +","+ tg.c2+","+tg.c3 + " Không phải Là 3 cạnh của tam giác");
        }
        //Tính chu vi
        System.out.println("\nChu vi của tam giác = " + tg.Chuvi());
        //Tính diện tích
        System.out.println("\nDiện tích của tam giác = " + tg.DienTich());
    }
}
