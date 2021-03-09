package Labs.s8;

public class KhachHangVietNam extends KhachHang {
    public String doiTuong;

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public double thanhTien() {
        if(getSoLuong()<50){
            return getSoLuong()*1000;
        }else if(getSoLuong() >= 50 && getSoLuong()<100){
            return (getSoLuong()-50)*1200 + 50 * 1000;
        }else if(getSoLuong()>=100 && getSoLuong() < 200){
            return (getSoLuong()-100)*1500+ 50 * 1200 + 50 * 1000;
        }else{
            return (getSoLuong()-200)*2000 +  100*1500 + 50 * 1200 + 50 * 1000;
        }
    }
}
