package Labs.s4;

public class Account{
    int id;
    String name;
    double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){

    }

    public void credit(int amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            return;
        }
        System.out.println("Nạp tien that bai.");
    }

    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Thanh Toan khong thanh cong");
            return;
        }
        this.balance -= amount;
    }
    public boolean tranferTo(Account account, int amount) {
        if (amount >0 && amount <= getBalance()) {
            debit(amount);
            account.credit(amount);
            return true;
        }
        return false;
    }

}
