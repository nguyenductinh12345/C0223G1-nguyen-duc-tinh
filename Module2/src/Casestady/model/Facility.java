package Casestady.model;

public abstract class Facility {
    private int maDichVu;
    private String tenDichVU;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(int maDichVu, String tenDichVU, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVU = tenDichVU;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVU() {
        return tenDichVU;
    }

    public void setTenDichVU(String tenDichVU) {
        this.tenDichVU = tenDichVU;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "maDichVu=" + maDichVu +
                ", tenDichVU='" + tenDichVU + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
