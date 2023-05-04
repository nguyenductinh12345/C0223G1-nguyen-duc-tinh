package Casestady.model.person;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private long luong;



    public Employee(String trinhDo, String viTri, long luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String ma, String hoTen, String ngaySinh, String gioiTinh, String soCMND,
                    String soDienThoai, String email, String trinhDo, String viTri, long luong) {
        super(ma, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    public String getIntoCsv() {
        return super.getMa() + "," + super.getHoTen() + "," + super.getNgaySinh() + "," + super.getGioiTinh() + "," +
                super.getSoCMND() + "," + super.getSoDienThoai() + "," + super.getEmail() +","+ this.trinhDo + ","+
                this.viTri+ ","+ this.luong;
    }
}
