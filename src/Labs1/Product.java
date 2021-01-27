package Labs1;

public class Product {
    int id;
    String name;
    float price;
    int qty;
    String unit;
    void run(){
        System.out.println("\n");
        System.out.println("Ma SP: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gia: " + price);
        System.out.println("So luong: " + qty);
        System.out.println("Don vi: " + unit);

    }
    void changeQty(int q){
        qty = q;
    }
    void changePrice(float p){
        price = p;

    }
    boolean checkStock(){
        if(qty>0) return true;
        return false;

    }
}
