package Assignment.ms6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong pb = new MonHocDaiCuong();
        pb.themLopHoc("T2008M", 25);
        pb.themLopHoc("T2010M", 28);
        pb.themLopHoc("T2009M", 30);
        pb.inDanhSach();
        pb.sapXep();
        System.out.println("----Sắp xếp lại----");
        pb.inDanhSach();
    }
}
