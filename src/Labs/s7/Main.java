package Labs.s7;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        News n = new News();
        n.setTitle("Xin Chào");
        n.setPublishDate("20/2/2021");
        n.setAuthor("Nguyễn Văn A");
        n.setContent("Tiểu Thuyết Tình Yêu");
        n.Display();
        System.out.println("Nhập Mảng ");
        n.Caculate();
    }
}
