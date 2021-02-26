package Assignment.ms3;

import java.util.ArrayList;

public class Product {
    private int id;
    ArrayList<String > productName;
    private int qty;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
    }

    public void kiemtra(){
        if(qty>0){
            System.out.println("Con hang trong kho.");
        }else{
            System.out.println("Het hang.");
        }
    }
}
