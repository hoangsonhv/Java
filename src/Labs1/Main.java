package Labs1;

public class Main {
    public static void main(String [] args){
        Product st = new Product();
        Product st1 = new Product();
        Product st2 = new Product();


        st.id = 1;
        st.name = "SP so 1";
        st.price = 1050;
        st.qty = 50;
        st.unit = "Chiec";
        st.run();
        st.changeQty(4);
        st.changePrice(30);
            System.out.println("gia tien moi " +st.price);
        if(st.checkStock()){
            System.out.println("San pham "+ st.name+" Con "+ st.qty+" sp");
        }else {
            System.out.println("San pham "+ st.name+" Het hang ");
        }


        st1.id = 2;
        st1.name = "SP so 2";
        st1.price = 100;
        st1.qty = 10;
        st1.unit = "Chiec";
        st1.run();
        st1.changeQty(5);
        st1.changePrice(500);
        System.out.println("gia tien moi " +st1.price);
        if(st1.checkStock()){
            System.out.println("San pham "+ st1.name+" Con "+ st1.qty+" sp");
        }else {
            System.out.println("San pham "+ st1.name+" Het hang ");
        }

        st2.id = 3;
        st2.name = "SP so 3";
        st2.price = 1000;
        st2.qty = 80;
        st2.unit = "Chiec";
        st2.run();
        st2.changeQty(10);
        st2.changePrice(20);
        System.out.println("gia tien moi " +st2.price);
        if(st2.checkStock()){
            System.out.println("San pham "+ st2.name+" Con "+ st.qty+" sp");
        }else {
            System.out.println("San pham "+ st2.name+" Het hang ");
        }
    }

}
