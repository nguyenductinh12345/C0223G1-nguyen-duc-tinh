package Casestady.model;

public abstract class Person {
    private int ma;
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTInh;
    private int soCMND;
    private int soDienThoai;
    private String email;

    public Person() {
    }

    public Person(int ma, String hoTen, String ngaySinh, boolean gioiTInh, int soCMND, int soDienThoai, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTInh = gioiTInh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTInh() {
        return gioiTInh;
    }

    public void setGioiTInh(boolean gioiTInh) {
        this.gioiTInh = gioiTInh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ma=" + ma +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTInh=" + gioiTInh +
                ", soCMND=" + soCMND +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }
}
