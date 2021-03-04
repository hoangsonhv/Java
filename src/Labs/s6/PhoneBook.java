package Labs.s6;

import Labs.s4.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p:phoneList){
            if(p.getName().equals(name)){
                if(!p.getPhone().contains(phone)){
                    p.addPhone(phone);
                }
                return;
            }
        }
        PhoneNumber p = new PhoneNumber(name,phone);
        phoneList.add(p);
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.getName().equals(name)){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNumber p:phoneList){
            if(p.getName().equals(name)){
                p.addPhone(newPhone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.getName().equals(name)){
                System.out.println("Da tim thay");
                return;
            }
        }
        System.out.println("Khong co trong danh ba");
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void printPhoneList(){
        for(PhoneNumber p :phoneList){
            System.out.println(p.getName());
            for(String s:p.getPhone()){
                System.out.println(s);
            }
        }
    }
}

