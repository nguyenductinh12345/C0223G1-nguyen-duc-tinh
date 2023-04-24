package ss17.bai_tap.bai_tap1.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int id;
    private String name;
    private double gia;
    private String HangSanXuat;
    private String mota;

    public SanPham(int id, String name, double gia, String hangSanXuat, String mota) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        HangSanXuat = hangSanXuat;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                ", HangSanXuat='" + HangSanXuat + '\'' +
                ", mota='" + mota + '\'' +
                '}';
    }
}
