package Labs.s6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Son","0987654321");
        pb.insertPhone("Huy","0987654322");
        pb.insertPhone("Giang","0123456789");
        pb.printPhoneList();
        pb.sort();
        pb.printPhoneList();
    }
}
