package Casestady.model.person;

import Casestady.model.person.Person;

public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String loaiKhach, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(int ma, String hoTen, String ngaySinh, boolean gioiTInh, int soCMND, int soDienThoai, String email, String loaiKhach, String diaChi) {
        super(ma, hoTen, ngaySinh, gioiTInh, soCMND, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' + super.toString() +
                '}';
    }
}
