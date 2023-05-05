package Casestady.model.person;

public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;

    public Customer(String loaiKhach, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String ma, String hoTen, String ngaySinh, String gioiTInh, String soCMND, String soDienThoai,
                    String email, String loaiKhach, String diaChi) {
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
        return "Customer{" + super.toString() +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String getintoCsv() {
        return super.getMa() + "," + super.getHoTen() + "," + super.getNgaySinh() + "," + super.getGioiTinh() + "," + super.getSoCMND() +
                "," + super.getSoDienThoai() + "," + super.getEmail() + "," + this.loaiKhach + "," + this.diaChi;
    }
}
