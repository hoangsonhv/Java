package Assignment.ms6;

import java.util.ArrayList;

public class LopHoc{
    public String name;
    public int soluonghocsinh;

    public LopHoc(String name, Integer soluonghocsinh){
        this.name = name;
        this.soluonghocsinh = soluonghocsinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoluonghocsinh() {
        return soluonghocsinh;
    }

    public void setSoluonghocsinh(int soluonghocsinh) {
        this.soluonghocsinh = soluonghocsinh;
    }
}
