package ss17.bai_tap.bai_tap1.rebository;

import ss17.bai_tap.bai_tap1.model.SanPham;

import java.util.List;

public interface ISanPhamRebository {
    List<SanPham> hienThiSanPham();
    void themSanPham(SanPham sanPham);
    List<SanPham> timKiem(String name);
}
