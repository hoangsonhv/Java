package Labs.s5;

public class Main {
    public static void main(String [] args){
//        5.1
        Person p = new Person();
        p.inputPerson();
        p.printPerson();
        System.out.println();

//        5.2
        Student st = new Student();
        st.inputPerson();
        st.printPerson();
        st.checkDT();

//        5.4
//        Lop lop = new Lop();
//        lop.nhaptt();

        GiaoVien gv = new GiaoVien();
        gv.addLop("T2008M");
        gv.inputPerson();
        gv.printPerson();
    }
}
