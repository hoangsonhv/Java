package Assignment.ms6;

import java.util.ArrayList;

public class LopHoc{
    public String name;
    public ArrayList<Integer> soluonghocsinh;

    public LopHoc(String name, Integer soluonghocsinh){
        this.name = name;
        this.soluonghocsinh = new ArrayList<Integer>();
        this.soluonghocsinh.add(soluonghocsinh);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ArrayList<Integer> getLopHoc() { return soluonghocsinh; }
    public void addSoluonghocsinh(Integer soluonghocsinh) {
        this.soluonghocsinh.add(soluonghocsinh);
    }
}
