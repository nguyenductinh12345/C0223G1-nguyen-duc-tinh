package Casestady.model.Facility;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String maDichVu, String tenDichVU, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
                 String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(maDichVu, tenDichVU, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa " +
                " tieuChuanPhong = '" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi = " + dienTichHoBoi + " m2 "+
                ", soTang = " +" tầng "+ soTang + super.toString();
    }
    public String getIntoCsv(){
        return super.getMaDichVu()+","+super.getTenDichVU()+","+super.getDienTichSuDung()+","+super.getChiPhiThue()+","+
                super.getSoLuongNguoiToiDa()+","+super.getKieuThue()+","+tieuChuanPhong+","+dienTichHoBoi+","+soTang;
//                String maDichVu, String tenDichVU, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
//                 String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang
    }
}
