package Assignment.ms6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong pb = new MonHocDaiCuong();
        pb.themLopHoc("T2008M", 25);
        pb.themLopHoc("T2008M", 28);
        pb.themLopHoc("T2009M", 30);
        pb.inDanhSach();
        System.out.println("<==== Sắp xếp lại ====>");
        pb.sapXep();
        pb.inDanhSach();
    }
}
