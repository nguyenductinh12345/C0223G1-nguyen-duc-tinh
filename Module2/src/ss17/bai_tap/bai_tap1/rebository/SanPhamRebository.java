package ss17.bai_tap.bai_tap1.rebository;

import ss17.bai_tap.bai_tap1.common.ReadsSanPham;
import ss17.bai_tap.bai_tap1.common.WritesSanPham;
import ss17.bai_tap.bai_tap1.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRebository implements ISanPhamRebository {
    ReadsSanPham readsSanPham = new ReadsSanPham();
    static WritesSanPham writesSanPham = new WritesSanPham();
    List<SanPham> list = new ArrayList<>();


    @Override
    public List<SanPham> hienThiSanPham() {
        return readsSanPham.readSanPham("src/ss17/bai_tap/bai_tap1/sanPham.data");
    }

    @Override
    public void themSanPham(SanPham sanPham) {
        list.add(sanPham);
        writesSanPham.write(list);
    }

    @Override
    public List<SanPham> timKiem(String name) {
        List<SanPham> sanPhamList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                sanPhamList.add(list.get(i));
            }
        }
        return sanPhamList;

    }
}
