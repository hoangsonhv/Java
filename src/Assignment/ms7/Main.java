package Assignment.ms7;

import Labs.s4_2.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> dsSv = new ArrayList<>();
        boolean run = true;
        do {
            System.out.println("Chon chuc nang: ");
            System.out.println("1.Them SV: ");
            System.out.println("2.Sua SV: ");
            System.out.println("3.Xoa SV: ");
            System.out.println("4.Sap xep theo GPA: ");
            System.out.println("5.Sap xep theo ten: ");
            System.out.println("6.Xem danh sach: ");
            System.out.println("0.Thoat");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c==0){
                run = false;
            }else if(c==1){
                System.out.println("Nhap id SV: ");
                int id = sc.nextInt();
                System.out.println("Nhap ten SV: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Nhap tuoi SV: ");
                int age = sc.nextInt();
                System.out.println("Nhap dia chi SV: ");
                sc.nextLine();
                String address = sc.nextLine();
                System.out.println("Nhap GPA: ");
                float gpa = sc.nextFloat();
                dsSv.add(new Student(id,name,age,address,gpa));
            }else if (c==2) {
                System.out.println("NHap id sv muon sua thong tin:");
                int id = sc.nextInt();
                for (Student s: dsSv){
                    if(id == s.getId()){
                        sc.nextLine();
                        System.out.println("NHap ten sv:");
                        s.setName(sc.nextLine());
                        System.out.println("NHap tuoi sv:");
                        s.setAge(sc.nextInt());
                        System.out.println("NHap dia chi sv:");
                        sc.nextLine();
                        s.setAddress(sc.nextLine());
                        System.out.println("NHap GPA sv:");
                        s.setGpa(sc.nextFloat());
                        break;
                    }
                }
            }else if (c==3){
                System.out.println("Nhap is sv muon xoa thong tin: ");
                int id = sc.nextInt();
                for (Student s:dsSv){
                    if (id == s.getId()){
                        dsSv.remove(s);
                        break;
                    }
                }
            }else if (c==4){
                Collections.sort(dsSv, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return (o2.getGpa() - o1.getGpa() > 0)?1:-1;
                    }
                });
            }else if(c== 5){
                Collections.sort(dsSv, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
            }else if(c==6){
                for(Student s: dsSv){
                    System.out.println(s.getName()+"-"+s.getGpa());
                }
            }
        }while (run);
    }
}
