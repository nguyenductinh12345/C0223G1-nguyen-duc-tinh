package ss10.bai_tap.bai_tap2.service;

import ss10.bai_tap.bai_tap2.model.HocSinh;
import ss10.bai_tap.bai_tap2.repository.IHocSinh;

import java.util.ArrayList;

public class QuanLy implements IHocSinh {
    private ArrayList<HocSinh> danhSach;
    public QuanLy(){
        this.danhSach=new ArrayList<HocSinh>();
    }

    public QuanLy(ArrayList<HocSinh> danhSach) {
        this.danhSach = danhSach;
    }

    @Override
    public HocSinh themMoi(int ma,String ten, String ngaySinh, String gioiTinh, String lop, double diemSo) {
        HocSinh hocSinh1 = new HocSinh(ma,ten,ngaySinh,gioiTinh,lop,diemSo);
        danhSach.add(hocSinh1);
        return  hocSinh1;
    }

    @Override
    public void xoa(int ma) {
        danhSach.removeIf(hs -> hs.getMa() == ma);
    }

    @Override
    public ArrayList<HocSinh> hienThiDanhSach() {
        return danhSach;
    }
}
