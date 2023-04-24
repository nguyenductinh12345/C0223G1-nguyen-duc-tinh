package ss17.bai_tap.bai_tap1.service;

import ss17.bai_tap.bai_tap1.model.SanPham;
import ss17.bai_tap.bai_tap1.rebository.SanPhamRebository;

import java.util.List;
import java.util.Scanner;

public class SanPhamServie implements ISanPhamServiec {
    Scanner scanner = new Scanner(System.in);
    SanPhamRebository sanPhamRebository = new SanPhamRebository();

    @Override
    public void hienThi() {
        List<SanPham> list = sanPhamRebository.hienThiSanPham();
        for (SanPham o : list) {
            System.out.println(o);
        }

    }

    @Override
    public void themSanPham() {
        System.out.println("Nhập id sản phẩm mới:");
        int addId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm mới:");
        String addName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm mới:");
        double addGia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất:");
        String addNhaSanXuat = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm:");
        String addMoTa = scanner.nextLine();
        SanPham sanPham = new SanPham(addId, addName, addGia, addNhaSanXuat, addMoTa);
        sanPhamRebository.themSanPham(sanPham);
        System.out.println("Thêm mới sản phẩm thành công");
        this.hienThi();
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        String timTen = scanner.nextLine();
        List<SanPham> sanPhamList = sanPhamRebository.timKiem(timTen);
        System.out.println(sanPhamList);

    }
}
