package ss10.bai_tap.bai_tap2.service;

import ss10.bai_tap.bai_tap2.model.HocSinh;
import ss10.bai_tap.bai_tap2.repository.HocSinhRepository;
import ss10.bai_tap.bai_tap2.repository.IHocSinhRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinhService implements IHocSinhService {
    Scanner scanner = new Scanner(System.in);
    private final HocSinhRepository hocSinhRepository = new HocSinhRepository();

    @Override
    public void hienThiHocSinhList() {
        List<HocSinh>hocSinhList=hocSinhRepository.getHocSinhList();
        for (HocSinh h: hocSinhList) {
            System.out.println(h);
        }
    }

    @Override
    public void themHocSinh() {
        System.out.println("Nhập mã học sinh: ");
        int maHocSinh=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh: ");
        String tenHocSinh=scanner.nextLine();
        System.out.println("Nhập ngày sinh học sinh: ");
        String ngaySinh=scanner.nextLine();
        System.out.println("Nhập giới tính học sinh: \n"+"1. Nam\n"+"2. Nữ\n");
        boolean gioiTinh = false;
        String chonGioiTinh=scanner.nextLine();
        if(chonGioiTinh.equals("1")){
            gioiTinh=true;
        }else if (chonGioiTinh.equals("2")){
            gioiTinh=false;
        }
        System.out.println("Nhập lớp của học sinh: ");
        String lop = scanner.nextLine();
        System.out.println("Nhập điểm của học sinh: ");
        double diem = Double.parseDouble(scanner.nextLine());
        HocSinh hocSinhMoi = new HocSinh(maHocSinh,tenHocSinh,ngaySinh,gioiTinh,lop,diem);
        hocSinhRepository.themHocSinh(hocSinhMoi);
        System.out.println("Thêm mới học sinh thành công"+ hocSinhMoi.getTen());
        this.hienThiHocSinhList();

    }

    @Override
    public void xoaHocSinh() {
        this.hienThiHocSinhList();
        System.out.println("Chọn mã học sinh cần xoá: ");
        int maHocSinhXoa= Integer.parseInt(scanner.nextLine());
        boolean xoaHocSinh = hocSinhRepository.xoaHocSinhTheoMa(maHocSinhXoa);
        if (xoaHocSinh){
            System.out.println("Xoá học sinh thành công");
            this.hienThiHocSinhList();
        }else {
            System.out.println("Không tìm thấy mã hoc sinh cần xoá");
        }

    }
}
