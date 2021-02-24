package Labs.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Room ds = new Room();
        ds.setRoom("Phong 1");
        ds.setIndex("102 Tran Duy Hung");
        ds.addUser("Hoàng Văn Sơn");
        ds.addUser("Trương Quang Huy");
        ds.printRoom();
    }
}
