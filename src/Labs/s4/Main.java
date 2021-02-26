package Labs.s4;

public class Main {
    public static void main(String [] args){
        Account a = new Account();
        a.setId(1);
        a.setName("Hoang Van A");
        a.setBalance(50000);
        Account b = new Account();
        b.setId(2);
        b.setName("Nguyen Van B");
        b.setBalance(20000);
        a.credit(10000);
        a.debit(40000);
        b.tranferTo(a,30000);


        System.out.println("A: " + a.getBalance());
        System.out.println("B: " + b.getBalance());
    }
}
