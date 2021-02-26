package Assignment.ms3;

import java.util.ArrayList;

public class Cart {
    private int id;
    String  customer;
    double grandTotal;
    ArrayList<Product> productList;
    private String city;

    public Cart(){
        productList = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public boolean addProduct(Product sp){
        if(sp.checkQty()){
            getProductList().add(sp);
            sp.setQty(sp.getQty()-1);
            setGrandTotal(getGrandTotal()+sp.getPrice());
            return true;
        }
        return false;
    }

    public void removeProduct(int index){
        Product p = productList.get(index);
        p.setQty(p.getQty()+1);
        getProductList().remove(index);
        setGrandTotal(getGrandTotal()-p.getPrice());
    }

    public double finalGrandTotal(){
        if(city=="HN" || city=="HCM"){
            return grandTotal+ grandTotal*1/100;
        }
        return grandTotal+ grandTotal*2/100;
    }


}
