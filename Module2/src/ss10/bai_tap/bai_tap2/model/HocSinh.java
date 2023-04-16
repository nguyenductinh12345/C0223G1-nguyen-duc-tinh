package ss10.bai_tap.bai_tap2.model;

public class HocSinh extends ConNguoi{
    private String lop;
    private double diem;


    public HocSinh(int ma, String ten, String ngaySinh, boolean gioiTinh, String lop, double diem) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diem = diem;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "HocSinh { " +super.toString() +" ,"+
                "lop='" + lop + '\'' +
                ", diem=" + diem+"}";
    }
}
