package ss10.bai_tap.bai_tap2.repository;

import ss10.bai_tap.bai_tap2.model.HocSinh;

import java.util.ArrayList;

public interface IHocSinh {
    HocSinh themMoi(int ma, String ten, String ngaySinh, String gioiTinh, String lop, double diemSo);
    void xoa(int ma);
    ArrayList<HocSinh> hienThiDanhSach();
}
