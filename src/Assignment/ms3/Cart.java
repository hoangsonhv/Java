package Assignment.ms3;

import java.util.ArrayList;

public class Cart {
    private int id;
    ArrayList<String > customer;
    private float grandTotal;
    ArrayList<String> productList;
    private String city;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Cart(){
        customer = new ArrayList<String>();
        productList = new ArrayList<String>();
    }
    public void addCart(String sp){
        productList.add(sp);
    }
    public void removeCart(String sp){
        productList.remove(sp);
    }

    public void in(){
        System.out.println("productList:");
        for (String i:productList){
            System.out.println(i);
        }
    }


}
