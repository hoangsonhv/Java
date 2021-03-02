package Labs.s5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String date;
    public String address;

    public Person(){

    }

    public Person(String name, String  gender, String date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String  gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputPerson(){
        Scanner p = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        setName(p.nextLine());
        System.out.println("Gioi Tinh: ");
        setGender(p.nextLine());
        System.out.println("Ngay Sinh: ");
        setDate(p.nextLine());
        System.out.println("Dia Chi: ");
        setAddress(p.nextLine());
    }

    public void printPerson(){
        System.out.println("Ten: "+getName());
        System.out.println("Gioi Tinh: : "+getGender());
        System.out.println("Ngay Sinh: "+getDate());
        System.out.println("Dia Chi: "+getAddress());
    }

}
