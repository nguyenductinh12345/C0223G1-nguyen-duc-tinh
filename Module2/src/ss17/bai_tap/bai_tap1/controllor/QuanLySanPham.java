package ss17.bai_tap.bai_tap1.controllor;

import ss17.bai_tap.bai_tap1.service.SanPhamServie;

import java.util.Scanner;

public class QuanLySanPham {
    Scanner scanner = new Scanner(System.in);
    SanPhamServie sanPhamServie = new SanPhamServie();

    public void showMenu() {
        int choine = 0;
        do {
            System.out.println("-------------- Quản lý sản phẩm -----------------\n" +
                    "1.Thêm sản phẩm.\n" +
                    "2.Hiển thị sản phẩm.\n" +
                    "3.Tìm kiếm sản phẩm theo Id\n" +
                    "0.Thoát.\n" +
                    "Vui lòng lựa chọn thao tác");
            choine = Integer.parseInt(scanner.nextLine());
            switch (choine) {
                case 1:
                    sanPhamServie.themSanPham();
                    break;
                case 2:
                    sanPhamServie.hienThi();
                    break;
                case 3:
                    sanPhamServie.timKiem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Bạn nhập sai chức năng vui lòng nhập lại.");
                    break;
            }
        } while (choine != 0);

    }
}
