package Casestady.model.Facility;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String maDichVu, String tenDichVU, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
                 String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVU, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House " +
                " tieuChuanPhong = '" + tieuChuanPhong + '\'' +
                ", soTang = "+" tầng " + soTang + super.toString();
    }
}
